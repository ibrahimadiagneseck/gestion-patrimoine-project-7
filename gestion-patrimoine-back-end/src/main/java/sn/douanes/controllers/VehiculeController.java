package sn.douanes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import sn.douanes.entities.*;
import sn.douanes.services.VehiculeService;

import java.sql.Date;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;



@RestController
////@RequestMapping(path = { "/", "/user"})
//@RequestMapping( "/")
//@CrossOrigin("http://localhost:4200")
public class VehiculeController {

    public static final String VEHICULE_DELETED_SUCCESSFULLY = "Suppression réussie de ";

    @Autowired
    VehiculeService vehiculeService;

    @GetMapping("/Vehicules")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public ResponseEntity<List<Vehicule>> listeVehicules() {
        List<Vehicule> vehicules = vehiculeService.getAllVehicules();
        return new ResponseEntity<>(vehicules, OK);
    }


    @PostMapping("/AjouterVehicule")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public Vehicule AjouterVehicule(@RequestBody Vehicule vehicule) {

        return vehiculeService.ajouterVehicule(vehicule.getNumeroSerie(), vehicule.getNumeroImmatriculation(), vehicule.getModele(), vehicule.getCodeEtat(), vehicule.getCodeTypeEnergie(), vehicule.getNumeroCarteGrise(), vehicule.getDateMiseEnCirculation(), vehicule.getCodePays(), vehicule.getCodeTypeVehicule(), vehicule.getCodeMarque(), vehicule.getIdentifiantBE());
    }

    @PostMapping("/ajouterVehiculeDotation")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public Vehicule ajouterVehiculeDotation(@RequestBody Vehicule vehicule) {

        return vehiculeService.ajouterVehiculeDotation(vehicule, vehicule.getDotationVehicule());
    }


    @PostMapping("/AjouterRequestParamVehicule")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public ResponseEntity<Vehicule> ajouterVehicule(
            @RequestParam("numeroSerie") String numeroSerie,
            @RequestParam("numeroImmatriculation") String numeroImmatriculation,
            @RequestParam("modele") String modele,
            @RequestParam("codeEtat") EtatVehicule codeEtat,
            @RequestParam("codeTypeEnergie") TypeEnergie codeTypeEnergie,
            @RequestParam("numeroCarteGrise") String numeroCarteGrise,
            @RequestParam("dateMiseEnCirculation") Date dateMiseEnCirculation,
            @RequestParam("codePays") Pays codePays,
            @RequestParam("codeTypeVehicule") TypeVehicule codeTypeVehicule,
            @RequestParam("codeMarque") MarqueVehicule codeMarque,
            @RequestParam("identifiantBE") ArticleBonEntree identifiantBE
    ) {
        Vehicule vehicule = vehiculeService.ajouterVehicule(numeroSerie, numeroImmatriculation, modele, codeEtat, codeTypeEnergie, numeroCarteGrise, dateMiseEnCirculation, codePays, codeTypeVehicule, codeMarque, identifiantBE);
        return new ResponseEntity<>(vehicule, OK);
    }


    @PutMapping("/ModifierVehicule")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public Vehicule ModifierVehicule(@RequestBody Vehicule v) {
        
        return vehiculeService.updateVehicule(v);
    }


    @DeleteMapping("SupprimerVehiculeById/{numeroSerie}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public ResponseEntity<HttpResponse> SupprimerPrestatairesById(@PathVariable("numeroSerie") String numeroSerie) {

        vehiculeService.deleteVehiculeById(numeroSerie);
        return response(OK, VEHICULE_DELETED_SUCCESSFULLY + numeroSerie);
    }

    private ResponseEntity<HttpResponse> response(HttpStatus httpStatus, String message) {
        return new ResponseEntity<>(
                new HttpResponse(httpStatus.value(), httpStatus, httpStatus.getReasonPhrase().toUpperCase(), message),
                httpStatus
        );
    }
}
