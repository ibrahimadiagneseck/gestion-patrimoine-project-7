import { HttpClient, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { environment } from 'src/environments/environment';
import { CustomHttpRespone } from '../model/custom-http-response.model';
import { BonEntree } from '../model/bon-entree.model';
import { MyDate } from '../model/my-date.model';
import { DatePipe } from '@angular/common';
import { BonDeSortie } from '../model/bon-de-sortie.model';

@Injectable({
  providedIn: 'root',
})
export class BonDeSortieService {

  private urlServeur = environment.rooturl1;

  constructor(private httpClient: HttpClient) { }


  // ----------------------------------------------------------------------------
  //  CRUD BonDeSortie

  public listeBonDeSorties(): Observable<BonDeSortie[]> {
    return this.httpClient.get<BonDeSortie[]>(`${this.urlServeur}/BonDeSorties`, { withCredentials: true });
  }

  public ajouterBonDeSortie(BonDeSortie: BonDeSortie): Observable<BonDeSortie> {
    return this.httpClient.post<BonDeSortie>(`${this.urlServeur}/AjouterBonDeSortie`, BonDeSortie, { withCredentials: true });
  }


  public modifierBonDeSortie(bonDeSortie: BonDeSortie): Observable<BonDeSortie> {
    return this.httpClient.put<BonDeSortie>(`${this.urlServeur}/ModifierBonDeSortie`, bonDeSortie, { withCredentials: true });
  }

  public supprimerBonDeSortieById(identifiantBE: string): Observable<CustomHttpRespone> {
    return this.httpClient.delete<CustomHttpRespone>(`${this.urlServeur}/SupprimerBonDeSortieById/${identifiantBE}`, { withCredentials: true });
  }

  public recupererBonDeSortieById(idIdentifiantBE: string): Observable<BonDeSortie> {
    return this.httpClient.get<BonDeSortie>(`${this.urlServeur}/RecupererBonDeSortieById/${idIdentifiantBE}`, { withCredentials: true });
  }




  public formatterMyDate(myDate: MyDate): string {
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
// ----------------------------------------------------------------------------
