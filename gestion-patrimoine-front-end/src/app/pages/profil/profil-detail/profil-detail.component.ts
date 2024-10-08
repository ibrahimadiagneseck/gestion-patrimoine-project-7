import { Component, Inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Subscription } from 'rxjs';
import { MAT_DIALOG_DATA, MatDialog, MatDialogRef } from '@angular/material/dialog';
import { NotificationService } from 'src/app/services/notification.service';
import { Authority } from 'src/app/model/authority.model';
import { AuthorityService } from 'src/app/services/authority.service';
import { NotificationType } from 'src/app/enum/notification-type.enum';
import { PopupConfirmationSupprimerComponent } from 'src/app/composants/supprimer/popup-confirmation-supprimer/popup-confirmation-supprimer.component';
import { NgForm } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-profil-detail',
  // standalone: true,
  // imports: [CommonModule],
  templateUrl: './profil-detail.component.html',
  styleUrl: './profil-detail.component.css'
})
export class ProfilDetailComponent {

  afficherPopupDetail: boolean = true;

  private subscriptions: Subscription[] = [];

  constructor(
    public dialogRef: MatDialogRef<ProfilDetailComponent>,
    @Inject(MAT_DIALOG_DATA) public authority: Authority,
    private matDialog: MatDialog,
    private authorityService: AuthorityService,
    private notificationService: NotificationService,

  ) {}


  private sendNotification(type: NotificationType, message: string, titre?: string): void {
    if (message) {
      this.notificationService.showAlert(type, message, titre);
    } else {
      this.notificationService.showAlert(type, 'Une erreur s\'est produite. Veuillez réessayer.', titre);
    }
  }

  ngOnInit(): void {

  }


  ngOnDestroy(): void {
    this.subscriptions.forEach(sub => sub.unsubscribe());
  }


  supprimerAuthority(code: String): void {

    const dialogRef = this.matDialog.open(
      PopupConfirmationSupprimerComponent,
      {
        width: '40%',
        enterAnimationDuration: '100ms',
        exitAnimationDuration: '100ms',
        data: {
          id: code,
          categorie: "authority",
          message: "Voulez-vous supprimer ce profil?"
        }
      }
    );

    dialogRef.afterClosed().subscribe(() => {
      this.popupFermer();
    });
  }

  popupFermer(): void {
    this.dialogRef.close();
  }


  popupModifier(): void {
    this.afficherPopupDetail = false;
  }

  PopupDetail(): void {
    this.afficherPopupDetail = true;
  }


  // --------------------------------------------------------------------------

  private clickButton(buttonId: string): void {
    document.getElementById(buttonId)?.click();
  }

  // pour envoyer tous les formulaires
  public submitForm(): void {
    this.clickButton('authority-form');
  }


  // --------------------------------------------------------------------------

  // pour executer modifierSecteurActivite
  public submitAuthorityForm(): void {
    this.clickButton('authority-form')
  }

  public modifierAuthoriti(AuthorityForm: NgForm): void {

    // -------------------------------------------------------------------------- METHODE 1
    // const formData = this.prestatairesService.createPrestatairesFormData(prestataireForm.value);

    // this.subscriptions.push(this.prestatairesService.ajouterPrestatairesRequestParam(formData).subscribe({
    //     next: (response: Prestataires) => {
    //       console.log(response);

    //     },
    //     error: (errorResponse: HttpErrorResponse) => {

    //     }
    //   })
    // );

    // -------------------------------------------------------------------------- METHODE 2

    // SECTEUR ACTIVITE



    this.subscriptions.push(this.authorityService.modifierAuthority(AuthorityForm.value).subscribe({
        next: (response: Authority) => {
          console.log(response);
          this.popupFermer();
          this.sendNotification(NotificationType.SUCCESS, `Modification réussie d'un profil`);
        },
        error: (errorResponse: HttpErrorResponse) => {

        }
      })
    );
  }


}
