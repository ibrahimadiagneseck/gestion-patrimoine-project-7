import { HttpClient, HttpEvent } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { environment } from 'src/environments/environment';
import { CustomHttpRespone } from '../model/custom-http-response.model';
import { DotationVehiculeVehicule } from '../model/dotation-vehicule-vehicule.model';




@Injectable({
  providedIn: 'root'
})
export class DotationVehiculeVehiculeService {

  private urlServeur = environment.rooturl1;

  constructor(private httpClient: HttpClient) {}


  public listeDotationVehiculeVehicule(): Observable<DotationVehiculeVehicule[]> {
    return this.httpClient.get<DotationVehiculeVehicule[]>(`${this.urlServeur}/DotationVehiculeVehicules`, { withCredentials: true });
  }

  public ajouterDotationVehiculeVehicule(dotationVehiculeVehicule: DotationVehiculeVehicule): Observable<DotationVehiculeVehicule> {
    return this.httpClient.post<DotationVehiculeVehicule>(`${this.urlServeur}/AjouterDotationVehiculeVehicule`, dotationVehiculeVehicule, { withCredentials: true });
  }


  public modifierDotationVehiculeVehicule(dotationVehiculeVehicule: DotationVehiculeVehicule): Observable<DotationVehiculeVehicule> {
    return this.httpClient.put<DotationVehiculeVehicule>(`${this.urlServeur}/ModifierDotationVehiculeVehicule`, dotationVehiculeVehicule, { withCredentials: true });
  }


  public supprimerDotationVehiculeVehiculeById(numeroSerie: string, identifiantDV: string): Observable<CustomHttpRespone> {
    return this.httpClient.delete<CustomHttpRespone>(`${this.urlServeur}/SupprimerDotationVehiculeVehiculeById/${numeroSerie}/${identifiantDV}`);
  }

  public recupererDotationByVehiculeId(numeroSerie: string): Observable<DotationVehiculeVehicule> {
    return this.httpClient.get<DotationVehiculeVehicule>(`${this.urlServeur}/RecupererDotationByVehiculeId/${numeroSerie}`);
  }

}
