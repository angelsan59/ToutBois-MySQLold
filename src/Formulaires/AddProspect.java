
package Formulaires;

import ControleDeChamps.ChampsDates;
import static GestionFichierTXT.EcritureDansFichier.EcritureFichier;
import static GestionFichierTXT.EcritureDansFichier.ModificationLigne;
import Tables.DataFileTableModel;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metier.AppelJavadoc;

/**
 * Ouvre la fenêtre de gestion des prospects. Ajout, Modification, Suppression et consultation de la liste des prospects existants.
 * @author Sandrine Ociepka
 * @author Stephane Coulon
 * @version 1.0
 */
public class AddProspect extends javax.swing.JDialog {

    /**
    * Création de la fenêtre de gestion des prospectss, chargement des données dans le tableau
    *@param parent : fenetrePrincipaleFrame
    * @param modal true ou false
    * @throws java.io.IOException erreur si le fichier parent n'existe pas
    */
    public AddProspect(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        
        /**
        * changer l'icone de la fenêtre (methode 1)
        */
        initComponents();
        
        /** 
         * changer l'icone des fenêtres, méthode 2
         */
        initialise () ;
        
         /**
        * Commande pour centrer la fenêtre dans l'écran
        */
        setLocationRelativeTo(null);
        }
        private void initialise(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.png")));
        }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titre = new javax.swing.JLabel();
        titreContact = new javax.swing.JLabel();
        lbNomenseigne = new javax.swing.JLabel();
        chpNomenseigne = new javax.swing.JTextField();
        bEffacer = new javax.swing.JButton();
        fondcouleur1 = new javax.swing.JPanel();
        lbAddresse1 = new javax.swing.JLabel();
        lbCodepostal = new javax.swing.JLabel();
        chpAdresse1 = new javax.swing.JTextField();
        chpAdresse2 = new javax.swing.JTextField();
        chpCodepostal = new javax.swing.JTextField();
        lbDatevisite = new javax.swing.JLabel();
        lbVille = new javax.swing.JLabel();
        chpVille = new javax.swing.JTextField();
        lbPays = new javax.swing.JLabel();
        lbSiret = new javax.swing.JLabel();
        chpSiret = new javax.swing.JTextField();
        chpDatevisite = new javax.swing.JTextField();
        comboPays = new javax.swing.JComboBox<>();
        fondcouleur2 = new javax.swing.JPanel();
        chpPrenom = new javax.swing.JTextField();
        lbTelfixe = new javax.swing.JLabel();
        chpTelfixe = new javax.swing.JTextField();
        lbTelportable = new javax.swing.JLabel();
        chpTelportable = new javax.swing.JTextField();
        lbNom = new javax.swing.JLabel();
        chpNom = new javax.swing.JTextField();
        lbPrenom = new javax.swing.JLabel();
        chpEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataFileTableModel model;
        String nomFichier="Data/Prospects.txt";
        TableProspects = new javax.swing.JTable();
        bSupprimer = new javax.swing.JButton();
        bModifier = new javax.swing.JButton();
        bAjouter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbidentifiant = new javax.swing.JLabel();
        lbid = new javax.swing.JLabel();
        imagefond = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mRetour = new javax.swing.JMenu();
        mAide = new javax.swing.JMenu();
        maproposde = new javax.swing.JMenuItem();
        mjavadoc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ToutBois - Gestion Prospects");

        jPanel1.setBackground(new java.awt.Color(187, 235, 219));
        jPanel1.setLayout(null);

        Titre.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Titre.setText("Gestion des prospects");
        jPanel1.add(Titre);
        Titre.setBounds(20, 10, 320, 30);

        titreContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titreContact.setText("Contact de l'enseigne");
        jPanel1.add(titreContact);
        titreContact.setBounds(20, 170, 210, 22);

        lbNomenseigne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNomenseigne.setText("Nom de l'enseigne *");
        lbNomenseigne.setFocusable(false);
        jPanel1.add(lbNomenseigne);
        lbNomenseigne.setBounds(340, 20, 122, 20);

        chpNomenseigne.setColumns(10);
        chpNomenseigne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpNomenseigne.setNextFocusableComponent(chpSiret);
        jPanel1.add(chpNomenseigne);
        chpNomenseigne.setBounds(480, 20, 170, 23);

        bEffacer.setText("Effacer");
        bEffacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bEffacerMouseClicked(evt);
            }
        });
        jPanel1.add(bEffacer);
        bEffacer.setBounds(660, 250, 120, 23);

        fondcouleur1.setBackground(new java.awt.Color(191, 191, 179));

        lbAddresse1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAddresse1.setText("Adresse *");

        lbCodepostal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCodepostal.setText("Code Postal *");

        chpAdresse1.setColumns(20);
        chpAdresse1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpAdresse1.setText("numero, nom de rue");
        chpAdresse1.setToolTipText("");

        chpAdresse2.setColumns(20);
        chpAdresse2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpAdresse2.setText("complément d'adresse");

        chpCodepostal.setColumns(5);
        chpCodepostal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbDatevisite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatevisite.setText("Date de la dernière visite *");

        lbVille.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbVille.setText("Ville *");

        chpVille.setColumns(10);
        chpVille.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbPays.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPays.setText("Pays *");

        lbSiret.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSiret.setText("SIRET *");

        chpSiret.setColumns(14);
        chpSiret.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpSiret.setNextFocusableComponent(chpDatevisite);

        chpDatevisite.setColumns(10);
        chpDatevisite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpDatevisite.setText("jj/mm/aaaa");

        comboPays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "France", "Belgique", "Suisse", "Pays bas", "-----------", "Afghanistan ", "Afrique du Sud ", "Albanie ", "Algérie ", "Allemagne ", "Angola ", "Antigua-et-Barbuda ", "Arabie saoudite ", "Argentine ", "Arménie ", "Australie ", "Autriche ", "Azerbaïdjan ", "Bahamas ", "Bahreïn ", "Bangladesh ", "Barbade ", "Belau ", "Belgique ", "Belize ", "Bénin ", "Bhoutan ", "Biélorussie ", "Birmanie ", "Bolivie ", "Bosnie-Herzégovine ", "Botswana ", "Brésil ", "Brunei ", "Bulgarie ", "Burkina ", "Burundi ", "Cambodge ", "Cameroun ", "Canada ", "Cap-Vert ", "Chili ", "Chine ", "Chypre ", "Colombie ", "Comores ", "Congo ", "Cook ", "Corée du Nord ", "Corée du Sud ", "Costa Rica ", "Côte d'Ivoire ", "Croatie ", "Cuba ", "Danemark ", "Djibouti ", "Dominique ", "Écosse ", "Égypte ", "Émirats arabes unis ", "Équateur ", "Érythrée ", "Espagne ", "Estonie ", "États-Unis ", "Éthiopie ", "Fidji ", "Finlande ", "France ", "Gabon ", "Gambie ", "Géorgie ", "Ghana ", "Grèce ", "Grenade ", "Guatemala ", "Guinée ", "Guinée-Bissao ", "Guinée équatoriale ", "Guyana ", "Haïti ", "Honduras ", "Hongrie ", "Inde ", "Indonésie ", "Iran ", "Irak ", "Irlande ", "Islande ", "Israël ", "Italie ", "Jamaïque ", "Japon ", "Jordanie ", "Kazakhstan ", "Kenya ", "Kirghizistan ", "Kiribati ", "Koweït ", "Laos ", "Lesotho ", "Lettonie ", "Liban ", "Liberia ", "Libye ", "Liechtenstein ", "Lituanie ", "Luxembourg ", "Macédoine ", "Madagascar ", "Malaisie ", "Malawi ", "Maldives ", "Mali ", "Malte ", "Maroc ", "Marshall ", "Maurice ", "Mauritanie ", "Mexique ", "Micronésie ", "Moldavie ", "Monaco ", "Mongolie ", "Mozambique ", "Namibie ", "Nauru ", "Népal ", "Nicaragua ", "Niger ", "Nigeria ", "Niue ", "Norvège ", "Nouvelle-Zélande ", "Oman ", "Ouganda ", "Ouzbékistan ", "Pakistan ", "Palestine ", "Panama ", "Papouasie - Nouvelle Guinée ", "Paraguay ", "Pays-Bas ", "Pérou ", "Philippines ", "Pologne ", "Portugal ", "Qatar ", "République centrafricaine ", "République démocratique du Con ", "République dominicaine ", "République tchèque ", "Roumanie ", "Royaume-Uni ", "Russie ", "Rwanda ", "Saint-Christophe-et-Niévès ", "Sainte-Lucie ", "Saint-Marin ", "Saint-Siège ", "Saint-Vincent-et-les-Grenadine ", "Salomon ", "Salvador ", "Samoa occidentales ", "Sao Tomé-et-Principe ", "Sénégal ", "Seychelles ", "Sierra Leone ", "Singapour ", "Slovaquie ", "Slovénie ", "Somalie ", "Soudan ", "Sri Lanka ", "Suède ", "Suisse ", "Suriname ", "Swaziland ", "Syrie ", "Tadjikistan ", "Tanzanie ", "Tchad ", "Thaïlande ", "Togo ", "Tonga ", "Trinité-et-Tobago ", "Tunisie ", "Turkménistan ", "Turquie ", "Tuvalu ", "Ukraine ", "Uruguay ", "Vanuatu ", "Venezuela ", "Viêt Nam ", "Yémen ", "Yougoslavie ", "Zambie ", "Zimbabwe " }));

        javax.swing.GroupLayout fondcouleur1Layout = new javax.swing.GroupLayout(fondcouleur1);
        fondcouleur1.setLayout(fondcouleur1Layout);
        fondcouleur1Layout.setHorizontalGroup(
            fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondcouleur1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondcouleur1Layout.createSequentialGroup()
                        .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAddresse1)
                            .addComponent(lbCodepostal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(fondcouleur1Layout.createSequentialGroup()
                                .addComponent(chpCodepostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbVille)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chpVille))
                            .addComponent(chpAdresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(fondcouleur1Layout.createSequentialGroup()
                                .addComponent(chpAdresse2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addGroup(fondcouleur1Layout.createSequentialGroup()
                                .addComponent(lbPays)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboPays, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondcouleur1Layout.createSequentialGroup()
                        .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chpSiret, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondcouleur1Layout.createSequentialGroup()
                                .addComponent(lbSiret)
                                .addGap(195, 195, 195)))
                        .addGap(61, 61, 61)
                        .addComponent(lbDatevisite)
                        .addGap(18, 18, 18)
                        .addComponent(chpDatevisite, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        fondcouleur1Layout.setVerticalGroup(
            fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondcouleur1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSiret, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpSiret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDatevisite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpDatevisite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpAdresse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpAdresse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPays, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVille, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodepostal)
                    .addComponent(chpCodepostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(fondcouleur1);
        fondcouleur1.setBounds(50, 50, 600, 110);

        fondcouleur2.setBackground(new java.awt.Color(191, 191, 179));

        chpPrenom.setColumns(10);
        chpPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpPrenomActionPerformed(evt);
            }
        });

        lbTelfixe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTelfixe.setText("Téléphone fixe *");

        chpTelfixe.setColumns(10);
        chpTelfixe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbTelportable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTelportable.setText("Téléphone portable");

        chpTelportable.setColumns(10);
        chpTelportable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNom.setText("Nom *");

        chpNom.setColumns(10);
        chpNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpNomActionPerformed(evt);
            }
        });

        lbPrenom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPrenom.setText("Prénom *");

        chpEmail.setColumns(10);
        chpEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmail.setText("Email *");

        javax.swing.GroupLayout fondcouleur2Layout = new javax.swing.GroupLayout(fondcouleur2);
        fondcouleur2.setLayout(fondcouleur2Layout);
        fondcouleur2Layout.setHorizontalGroup(
            fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondcouleur2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNom)
                    .addComponent(lbEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondcouleur2Layout.createSequentialGroup()
                        .addComponent(chpNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPrenom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addComponent(chpPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTelfixe))
                    .addGroup(fondcouleur2Layout.createSequentialGroup()
                        .addComponent(chpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTelportable)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chpTelportable, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpTelfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        fondcouleur2Layout.setVerticalGroup(
            fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondcouleur2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrenom)
                    .addComponent(chpPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpTelportable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelportable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpTelfixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(fondcouleur2);
        fondcouleur2.setBounds(50, 200, 600, 70);

        model = new DataFileTableModel(nomFichier);
        TableProspects.setModel(model);
        TableProspects.createDefaultColumnsFromModel();

        // Retirer les colonnes qu'on ne veut pas afficher dans le tableau
        // Le numéro des colonnes se décale à chaque retrait, d'où les nombreux retraits de la colonne 7
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(3));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(5));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
        TableProspects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProspectsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableProspects);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 280, 770, 120);

        bSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconemoins.jpg"))); // NOI18N
        bSupprimer.setText("Supprimer");
        bSupprimer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSupprimerMouseClicked(evt);
            }
        });
        jPanel1.add(bSupprimer);
        bSupprimer.setBounds(660, 220, 120, 27);

        bModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconemodif.jpg"))); // NOI18N
        bModifier.setText("Modifier");
        bModifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bModifierMouseClicked(evt);
            }
        });
        jPanel1.add(bModifier);
        bModifier.setBounds(660, 190, 120, 27);

        bAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconeplus.jpg"))); // NOI18N
        bAjouter.setText("Ajouter");
        bAjouter.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAjouterMouseClicked(evt);
            }
        });
        jPanel1.add(bAjouter);
        bAjouter.setBounds(660, 160, 120, 27);

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("* champs obligatoires");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 170, 250, 20);

        lbidentifiant.setText("Identifiant");
        jPanel1.add(lbidentifiant);
        lbidentifiant.setBounds(710, 10, 60, 14);
        jPanel1.add(lbid);
        lbid.setBounds(720, 30, 40, 20);

        imagefond.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        imagefond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meubles4.jpg"))); // NOI18N
        jPanel1.add(imagefond);
        imagefond.setBounds(0, -30, 790, 480);

        mRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconearbre.jpg"))); // NOI18N
        mRetour.setText("Retour à la fenêtre principale");
        mRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mRetourMouseClicked(evt);
            }
        });
        jMenuBar1.add(mRetour);

        mAide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconeaide.jpg"))); // NOI18N
        mAide.setText("Aide");

        maproposde.setText("A propos de");
        mAide.add(maproposde);

        mjavadoc.setText("Javadoc");
        mjavadoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mjavadocActionPerformed(evt);
            }
        });
        mAide.add(mjavadoc);

        jMenuBar1.add(mAide);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chpPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chpPrenomActionPerformed

    }//GEN-LAST:event_chpPrenomActionPerformed

    private void chpNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chpNomActionPerformed

    }//GEN-LAST:event_chpNomActionPerformed

    private void mRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mRetourMouseClicked
        dispose();
    }//GEN-LAST:event_mRetourMouseClicked

    private void bEffacerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEffacerMouseClicked
        
        // Action sur le bouton Effacer, purge des champs de saisies et suppression de la selection dans la table.
        effacerchampsropects() ;
        
    }//GEN-LAST:event_bEffacerMouseClicked

    private void TableProspectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProspectsMouseClicked
      
        // Je récupére l'identifiant, colonne 1.
        lbid.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),1));          
        // Je récupére le nom de l'enseigne, colonne 2.
        chpNomenseigne.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),2));
        // Je récupére le numéro de Siret, colonne 3.
        chpSiret.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),3));
       // Je récupére la date de la dernière visite, colonne 4.
         chpDatevisite.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),4));
         // Je récupére l'adresse, colonne 5.
        chpAdresse1.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),5));
        // Je récupére le complément d'adresse, colonne 6.
        chpAdresse2.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),6));
        // Je récupére le code postal, colonne 7.
        chpCodepostal.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),7));
        // Je récupére la ville, colonne 8.
        chpVille.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),8));
        // Je récupére le pays, colonne 9.
       // comboPays.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),9));
        // Je récupére le nom de contact, colonne 10.
        chpNom.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),10));
        // Je récupére le prénom, colonne 11.
        chpPrenom.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),11));
         // Je récupére le téléphone fixe, colonne 12.
        chpTelfixe.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),12));
        // Je récupére le téléphone portable, colonne 13.
        chpTelportable.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),13));
        // Je récupére l'email, colonne 14.
        chpEmail.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),14));
             
    }//GEN-LAST:event_TableProspectsMouseClicked

    private void bAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAjouterMouseClicked
        
        // Je recupere le nombre de ligne (soit le nombre de clients.
        int nbdeligne = TableProspects.getRowCount() ;
        //Je récupére les caractéristique du nouveau client.
        String clnomenseigne = chpNomenseigne.getText() ;
        String clsiret = chpSiret.getText() ;
        String clvisite = chpDatevisite.getText() ;
        String cladresse1 = chpAdresse1.getText() ;
        String cladresse2 = chpAdresse2.getText() ;
        String clcodepostal = chpCodepostal.getText() ;
        String clville = chpVille.getText() ;
        String clpays = (String) comboPays.getSelectedItem() ;
        String clnom = chpNom.getText() ;
        String clprenom = chpPrenom.getText() ;
        String cltelfixe = chpTelfixe.getText() ;
        String cltelportable = chpTelportable.getText() ;
        String clemail = chpEmail.getText() ;
        String clActif = "Oui" ;
        String chaine = (clActif + ";" + (nbdeligne+1) + ";" + clnomenseigne + ";" + clsiret + ";" + clvisite + ";" + cladresse1  + ";" + cladresse2
                + ";" + clcodepostal  + ";" + clville  + ";" + clpays  + ";" + clnom  + ";" + clprenom  + ";" + cltelfixe
                + ";" + cltelportable  + ";" + clemail  + "\n");
        
            
            


        try {
            ChampsDates averifier = new ChampsDates () ;
            boolean datebonne = false ;
            datebonne = averifier.sidatebonne(clvisite) ;
            if (datebonne == true) {
                EcritureFichier ("Data/Prospects.txt", chaine) ;
            // pop up de confirmation d'ajout
            JOptionPane.showMessageDialog(null, "Le prospect a bien été ajouté", "Ajout de prospect", JOptionPane.INFORMATION_MESSAGE);
                 // Actualisation de la table
                rafraichissementdelatable () ;
                // Effacer les données du formulaire
                effacerchampsropects() ;
            }
            else
            {   
                JOptionPane.showMessageDialog(null, "ATTENTION : Le prospect n'a pas été ajouté. \nLa date indiquée est érronée.", "Ajout de prospect", JOptionPane.ERROR_MESSAGE);
                // Actualisation de la table
                rafraichissementdelatable () ;
                // Effacer les données du formulaire
                //effacerchampsropects() ;
                chpDatevisite.setText ("") ;
            }
            } 
        catch (IOException ex) 
            {
            Logger.getLogger(AddRep.class.getName()).log(Level.SEVERE, null, ex);
            } 
        catch (ParseException ex) 
            {
            Logger.getLogger(AddProspect.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_bAjouterMouseClicked

    private void bModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bModifierMouseClicked
        // Je recupere la ligne à modifier
         //int ligneactuelle = TableClients.getSelectedRow() + 1 ;
        String clActif = "Oui" ;
        String clid = lbid.getText() ;
        int clid1 = Integer.parseInt(clid);
        String clnomenseigne = chpNomenseigne.getText() ;
        String clsiret = chpSiret.getText() ;
        String clvisite = chpDatevisite.getText() ;
        String cladresse1 = chpAdresse1.getText() ;
        String cladresse2 = chpAdresse2.getText() ;
        String clcodepostal = chpCodepostal.getText() ;
        String clville = chpVille.getText() ;
        String clpays = (String) comboPays.getSelectedItem() ;
        String clnom = chpNom.getText() ;
        String clprenom = chpPrenom.getText() ;
        String cltelfixe = chpTelfixe.getText() ;
        String cltelportable = chpTelportable.getText() ;
        String clemail = chpEmail.getText() ;
        String chaine = (clActif + ";" + clid + ";" + clnomenseigne + ";" + clsiret + ";" + clvisite + ";" + cladresse1  + ";" + cladresse2
                + ";" + clcodepostal  + ";" + clville  + ";" + clpays  + ";" + clnom  + ";" + clprenom  + ";" + cltelfixe
                + ";" + cltelportable  + ";" + clemail  + "\n");
        
        // Ecraser la ligne du prospect avec la position active.
        try {
            ChampsDates averifier = new ChampsDates () ;
            boolean datebonne = false ;
            datebonne = averifier.sidatebonne(clvisite) ;
            if (datebonne == true) {
                ModificationLigne ("Data/Prospects.txt", chaine, clid1) ;
                // pop up de confirmation de modification
                JOptionPane.showMessageDialog(null, "Le prospect a été modifié", "Modification de prospect", JOptionPane.INFORMATION_MESSAGE);
                 // Actualisation de la table
                rafraichissementdelatable () ;
                // Effacer les données du formulaire
                effacerchampsropects() ;
            }
            else
            {   
                JOptionPane.showMessageDialog(null, "ATTENTION : Le prospect n'a pas été modifié. \nLa date indiquée est érronée.", "Modification de prospect", JOptionPane.ERROR_MESSAGE);
                // Actualisation de la table
                rafraichissementdelatable () ;
                // Effacer les données du formulaire
                //effacerchampsropects() ;
                chpDatevisite.setText ("") ;
            }
            } 
        catch (IOException ex) 
            {
            Logger.getLogger(AddRep.class.getName()).log(Level.SEVERE, null, ex);
            } 
        catch (ParseException ex) 
            {
            Logger.getLogger(AddProspect.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_bModifierMouseClicked

    private void bSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSupprimerMouseClicked
            // Je recupere la ligne à supprimer
       //int ligneactuelle = TableClients.getSelectedRow() + 1 ;
        String clActif = "Non" ;
        String clid = lbid.getText() ;
        int clid1 = Integer.parseInt(clid);
        String clnomenseigne = chpNomenseigne.getText() ;
        String clsiret = chpSiret.getText() ;
        String clvisite = chpDatevisite.getText() ;
        String cladresse1 = chpAdresse1.getText() ;
        String cladresse2 = chpAdresse2.getText() ;
        String clcodepostal = chpCodepostal.getText() ;
        String clville = chpVille.getText() ;
        String clpays = (String) comboPays.getSelectedItem() ;
        String clnom = chpNom.getText() ;
        String clprenom = chpPrenom.getText() ;
        String cltelfixe = chpTelfixe.getText() ;
        String cltelportable = chpTelportable.getText() ;
        String clemail = chpEmail.getText() ;
        
        String chaine = (clActif + ";" + clid + ";" + clnomenseigne + ";" + clsiret + ";" + clvisite + ";" + cladresse1  + ";" + cladresse2
                + ";" + clcodepostal  + ";" + clville  + ";" + clpays  + ";" + clnom  + ";" + clprenom  + ";" + cltelfixe
                + ";" + cltelportable  + ";" + clemail  + "\n");
        
        // Ecraser la ligne du prospect avec la position inactive.
        try {
            ModificationLigne ("Data/Prospects.txt", chaine, clid1) ;
            // pop up de confirmation de modification
            JOptionPane.showMessageDialog(null, "Le prospect a été spprimé de la liste", "Suppression de prospect", JOptionPane.INFORMATION_MESSAGE);
            
            // Actualisation de la table
            rafraichissementdelatable () ;
           
            // Effacer les données du formulaire
            effacerchampsropects() ;
            } 
        catch (IOException ex) 
            {
            Logger.getLogger(AddRep.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_bSupprimerMouseClicked

    private void mjavadocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mjavadocActionPerformed
       try {
            AppelJavadoc.lancerjavadoc ();
        } catch (URISyntaxException ex) {
            Logger.getLogger(FenetrePrincipaleFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mjavadocActionPerformed

    /**
     * Mise en page de la fenêtre de gestion de prospects
     * @param args arguments utilisés pour créer la fenêtre
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddProspect dialog = null;
                try {
                    dialog = new AddProspect(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(AddProspect.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    /*
    * Fonction pour effacer tous les champs de saisies.
    */
    public void effacerchampsropects () {
        chpNomenseigne.setText ("") ;
        chpSiret.setText ("") ;
        chpDatevisite.setText ("") ;
        chpAdresse1.setText ("") ;
        chpAdresse2.setText ("") ;
        chpCodepostal.setText ("") ;
        chpVille.setText ("") ;
        chpNom.setText ("") ;
        chpPrenom.setText ("") ;
        chpEmail.setText ("") ;
        chpTelfixe.setText ("") ;
        chpTelportable.setText ("") ;
        lbid.setText ("") ;
        TableProspects.getSelectionModel().clearSelection();
    }
    
    public void rafraichissementdelatable () throws IOException {
            DataFileTableModel model1;
            model1 = new DataFileTableModel("Data/Prospects.txt");
            model1.fireTableDataChanged();
            TableProspects.setModel(model1);
            TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(3));
            TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(5));
            TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
            TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
            TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
            TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
            TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(8));
            TableProspects.getSelectionModel().clearSelection();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableProspects;
    private javax.swing.JLabel Titre;
    private javax.swing.JButton bAjouter;
    private javax.swing.JButton bEffacer;
    private javax.swing.JButton bModifier;
    private javax.swing.JButton bSupprimer;
    private javax.swing.JTextField chpAdresse1;
    private javax.swing.JTextField chpAdresse2;
    private javax.swing.JTextField chpCodepostal;
    private javax.swing.JTextField chpDatevisite;
    private javax.swing.JTextField chpEmail;
    private javax.swing.JTextField chpNom;
    private javax.swing.JTextField chpNomenseigne;
    private javax.swing.JTextField chpPrenom;
    private javax.swing.JTextField chpSiret;
    private javax.swing.JTextField chpTelfixe;
    private javax.swing.JTextField chpTelportable;
    private javax.swing.JTextField chpVille;
    private javax.swing.JComboBox<String> comboPays;
    private javax.swing.JPanel fondcouleur1;
    private javax.swing.JPanel fondcouleur2;
    private javax.swing.JLabel imagefond;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAddresse1;
    private javax.swing.JLabel lbCodepostal;
    private javax.swing.JLabel lbDatevisite;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbNomenseigne;
    private javax.swing.JLabel lbPays;
    private javax.swing.JLabel lbPrenom;
    private javax.swing.JLabel lbSiret;
    private javax.swing.JLabel lbTelfixe;
    private javax.swing.JLabel lbTelportable;
    private javax.swing.JLabel lbVille;
    private javax.swing.JLabel lbid;
    private javax.swing.JLabel lbidentifiant;
    private javax.swing.JMenu mAide;
    private javax.swing.JMenu mRetour;
    private javax.swing.JMenuItem maproposde;
    private javax.swing.JMenuItem mjavadoc;
    private javax.swing.JLabel titreContact;
    // End of variables declaration//GEN-END:variables
}
