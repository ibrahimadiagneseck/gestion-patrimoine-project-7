import { HttpClient, HttpEvent } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { CustomHttpRespone } from '../model/custom-http-response.model';
import { BordereauLivraison } from '../model/bordereau-livraison.model';
import { DatePipe } from '@angular/common';
import { MyDate } from '../model/my-date.model';

@Injectable({
  providedIn: 'root'
})
export class BordereauLivraisonService {

  private urlServeur = environment.rooturl2;

  constructor(
    private httpClient: HttpClient
  ) {}


  public listeBordereauLivraisons(): Observable<BordereauLivraison[]> {
    return this.httpClient.get<BordereauLivraison[]>(`${this.urlServeur}/BordereauLivraisons`);
  }

  public ajouterBordereauLivraison(bordereauLivraison: BordereauLivraison): Observable<BordereauLivraison> {
    return this.httpClient.post<BordereauLivraison>(`${this.urlServeur}/AjouterBordereauLivraison`, bordereauLivraison);
  }

  public ajouterBordereauLivraisonRequestParam(formData: FormData): Observable<BordereauLivraison> {
    return this.httpClient.post<BordereauLivraison>(`${this.urlServeur}/AjouterRequestParamBordereauLivraison`, formData);
  }

  public modifierBordereauLivraison(bordereauLivraison: BordereauLivraison): Observable<BordereauLivraison> {
    return this.httpClient.put<BordereauLivraison>(`${this.urlServeur}/ModifierBordereauLivraison`, bordereauLivraison);
  }


  public supprimerBordereauLivraisonById(identifiantBL: string): Observable<CustomHttpRespone> {
    return this.httpClient.delete<CustomHttpRespone>(`${this.urlServeur}/SupprimerBordereauLivraisonById/${identifiantBL}`);
  }





  public formatterMyDate(myDate: MyDate): string  {
      if (!myDate || !myDate.year || !myDate.month || !myDate.day) {
          return '';
      }

      const { year, month, day } = myDate;
      const date = new Date(year, month - 1, day);

      const datePipe = new DatePipe('en-US');
      const formattedDate = datePipe.transform(date, 'yyyy-MM-dd') || '';
      return formattedDate;
  }

}
