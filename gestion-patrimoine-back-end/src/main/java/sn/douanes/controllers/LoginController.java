package sn.douanes.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import sn.douanes.entities.Utilisateur;
import sn.douanes.repositories.AgentRepository;
import sn.douanes.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;

import sn.douanes.services.EmailService;
import sn.douanes.services.UtilisateurService;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class LoginController {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmailService emailService;


    @PostMapping("/inscription")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public ResponseEntity<String> registerUser(@RequestBody Utilisateur utilisateur) {

        Utilisateur savedUtilisateur = null;

        ResponseEntity response = null;

        try {

            savedUtilisateur = utilisateurService.registerUser(utilisateur);

            if (savedUtilisateur.getUtilisateurId() > 0) {

                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }
        } catch (Exception ex) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occured due to " + ex.getMessage());
        }
        return response;
    }

    @RequestMapping("/connexion")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public ResponseEntity<Utilisateur> getUserDetailsAfterLogin(Authentication authentication) {

        Utilisateur utilisateur = utilisateurRepository.findByUserName(authentication.getName());

        if (null != utilisateur) {
            return new ResponseEntity<>(utilisateur, OK);
        } else {
            return null;
        }
    }



    @GetMapping("/Users")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public ResponseEntity<List<Utilisateur>> getAllAjouterUsers() {
        List<Utilisateur> authority = utilisateurRepository.findAll();
        return new ResponseEntity<>(authority, OK);
    }


    @GetMapping("RecupererUserByUserName/{userName}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public Utilisateur RecupererUserByUserName(@PathVariable("userName") String userName) {
        return utilisateurService.getUserByUserName(userName);
    }


    @PostMapping("/AjouterUser")
    @PreAuthorize("hasAnyAuthority('ADMINISTRATEUR')")
    public ResponseEntity<String> ajouterUser(@RequestBody Utilisateur utilisateur) {

        Utilisateur savedUtilisateur = null;

        ResponseEntity response = null;

        try {

            savedUtilisateur = utilisateurService.addNewUser(utilisateur);

            if (savedUtilisateur.getUtilisateurId() > 0) {

                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }
        } catch (Exception ex) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occured due to " + ex.getMessage());
        }
        return response;
    }
}
