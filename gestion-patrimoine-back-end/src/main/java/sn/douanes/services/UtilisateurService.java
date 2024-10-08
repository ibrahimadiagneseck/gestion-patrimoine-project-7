package sn.douanes.services;

import sn.douanes.exception.entities.*;
import sn.douanes.entities.Agent;
import sn.douanes.entities.Utilisateur;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public interface UtilisateurService {

    List<Utilisateur> getUsers();

    Utilisateur findByMatriculeAgent(Agent agent);

    Utilisateur getUserByUserName(String userName);

    Utilisateur registerUser(Utilisateur utilisateur) throws UserNotFoundException, AgentExistException, IOException, NotAnImageFileException, MessagingException;

    Utilisateur addNewUser(Utilisateur utilisateur) throws UserNotFoundException, AgentExistException, IOException, NotAnImageFileException, MessagingException;

    Utilisateur updateUser(Utilisateur utilisateur) throws UserNotFoundException, EmailExistException, IOException, NotAnImageFileException;

    void deleteUserByMatriculeAgent(Agent agent) throws IOException;

    void resetPasswordByMatriculeAgent(Agent agent) throws MessagingException, AgentNotFoundException;

}
