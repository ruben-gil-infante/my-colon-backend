/* TAULA USUARI */
DROP TABLE IF EXISTS usuari;

CREATE TABLE usuari(
    id                      SERIAL          PRIMARY KEY,
    nom                     VARCHAR         NOT NULL,
    primer_cognom           VARCHAR         NOT NULL,
    segon_cognom            VARCHAR         NOT NULL,
    correu_electronic       VARCHAR         UNIQUE,
    genere                  INT             NOT NULL,
    data_naixement          DATE            NOT NULL,
    password                VARCHAR         NOT NULL
);

/* CANVIS BUCALS */
DROP TABLE IF EXISTS canvis_bucals;

CREATE TABLE canvis_bucals (
    id                      SERIAL          PRIMARY KEY,
    afirmatiu               BOOLEAN         NOT NULL,
    simptomes               VARCHAR         NOT NULL,
    data                    DATE            DEFAULT CURRENT_TIMESTAMP ,
    usuari                  INT             NOT NULL,
    CONSTRAINT FK_CANVIS_BUCALS_USER_ID  FOREIGN KEY (usuari)
    REFERENCES usuari(id)
);

/* DIARREES */
DROP TABLE IF EXISTS diarrees;

CREATE TABLE diarrees (
    id                  SERIAL          PRIMARY KEY,
    afirmatiu           BOOLEAN         NOT NULL,
    vegades             INT             NOT NULL,
    escala_bristol      INT             NOT NULL,
    color               INT             NOT NULL,
    data                DATE            DEFAULT CURRENT_TIMESTAMP ,
    usuari              INT             NOT NULL,
    CONSTRAINT FK_DIARRES_USUARI_ID FOREIGN KEY (usuari)
    REFERENCES usuari (id)
);

/* DOLOR */
DROP TABLE IF EXISTS dolor;

CREATE TABLE dolor (
    id              SERIAL          PRIMARY KEY,
    afirmatiu       BOOLEAN         NOT NULL,
    localitzacio    VARCHAR         NOT NULL,
    valor           INT             NOT NULL,
    descripcio      VARCHAR         NOT NULL,
    aparicio        VARCHAR         NOT NULL,
    data            DATE            DEFAULT CURRENT_TIMESTAMP ,
    usuari          INT             NOT NULL,
    CONSTRAINT FK_DOLOR_USUARI_ID     FOREIGN KEY(usuari)
    REFERENCES usuari(id)

);

/* FATIGA */
DROP TABLE IF EXISTS fatiga;

CREATE TABLE fatiga (
    id              SERIAL      PRIMARY KEY,
    afirmatiu       BOOLEAN     NOT NULL,
    puntuacio       INT         NOT NULL,
    data            DATE        DEFAULT CURRENT_TIMESTAMP ,
    usuari          INT         NOT NULL,
    CONSTRAINT FK_FATIGA_USUARI_ID  FOREIGN KEY(usuari)
    REFERENCES usuari(id)
);

/* REESTRENYIMENT */
DROP TABLE IF EXISTS reestrenyiment;

CREATE TABLE reestrenyiment (
    id                      SERIAL      PRIMARY KEY,
    afirmatiu               BOOLEAN     NOT NULL,
    ultim_cop               VARCHAR     NOT NULL,
    color                   INT         NOT NULL,
    escala_bristol          INT         NOT NULL,
    data                    DATE        DEFAULT CURRENT_TIMESTAMP ,
    usuari                  INT         NOT NULL,
    CONSTRAINT FK_REESTRENYIMENT_USUARI_ID FOREIGN KEY (usuari)
    REFERENCES USUARI (id)
);

/* NUTRICIO */
DROP TABLE IF EXISTS nutricio;

CREATE TABLE nutricio (
    id              SERIAL      PRIMARY KEY,
    usuari          INT         NOT NULL,
    esmorzar        INT         NOT NULL,
    dinar           INT         NOT NULL,
    berenar         INT         NOT NULL,
    sopar           INT         NOT NULL,
    gots_aigua      INT         NOT NULL,
    data            DATE        DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK_NUTRICIO_USUARI   FOREIGN KEY (usuari)
    REFERENCES usuari (id)
);

/* MEDICACIO */
DROP TABLE IF EXISTS medicacio;

CREATE TABLE medicacio (
    id              SERIAL          PRIMARY KEY,
    usuari          INT             NOT null,
    dosi            VARCHAR         NOT NULL,
    nom             VARCHAR         NOT NULL,
    forma           INT             NOT NULL,
    franja          INT             NOT NULL,
    data            VARCHAR         DEFAULT CURRENT_TIMESTAMP ,
    CONSTRAINT FK_MEDICACIO_USUARI FOREIGN KEY (usuari)
    REFERENCES USUARI (id)
);

/* EVENT */
DROP TABLE IF EXISTS NOTA;

CREATE TABLE nota (
    id                  SERIAL      PRIMARY KEY,
    usuari              INT         NOT NULL,
    descripcio          VARCHAR     NOT NULL,
    data                DATE        DEFAULT CURRENT_TIMESTAMP ,
    CONSTRAINT FK_EVENT_USER   FOREIGN KEY (usuari)
    REFERENCES usuari(id)
);

/* VOMITS */
DROP TABLE IF EXISTS vomits;

CREATE TABLE vomits (
    id              SERIAL          PRIMARY KEY,
    usuari          INT             NOT NULL,
    afirmatiu       BOOLEAN         NOT NULL,
    cops            INT             NOT NULL,
    descripcio      VARCHAR         NOT NULL,
    avui            BOOLEAN         NOT NULL,
    data            DATE            DEFAULT CURRENT_TIMESTAMP,
    constraint FK_VOMITS_USUARI foreign key (usuari)
    references usuari(id)
);

/* ESDEVENIMENT */
DROP TABLE IF EXISTS esdeveniment;

CREATE TABLE esdeveniment (
    id                      SERIAL          PRIMARY KEY,
    data                    DATE            NOT NULL,
    numero_telefon          VARCHAR         NOT NULL,
    ubicacio                VARCHAR         NOT NULL,
    descripcio              VARCHAR         NOT NULL
);



/* SIGNE VITAL */
DROP TABLE IF EXISTS signe_vital;

CREATE TABLE signe_vital(
    id                      SERIAL          PRIMARY KEY,
    data                    DATE            NOT NULL,
    usuari                  INT             NOT NULL,
    valor                   INT             NOT NULL,
    valor_secundari         INT             DEFAULT -1,
    tipus                   INT             NOT NULL,
    constraint FK_SIGNE_VITAL_USUARI foreign key (usuari)
    references usuari(id)
);


/* MESSAGE */
DROP TABLE IF EXISTS message;

CREATE TABLE message (
    message_id          SERIAL          PRIMARY KEY,
    text                VARCHAR         NULL,
    emisor_id           INT             NOT NULL,
    receptor_id         INT             NOT NULL,
    codi_conversa       VARCHAR         NOT NULL,

    constraint FK_EMISOR_ID_USUARI foreign key (emisor_id)
    references usuari(id),
    constraint FK_RECEPTOR_ID foreign key (receptor_id)
    references usuari(id)
);