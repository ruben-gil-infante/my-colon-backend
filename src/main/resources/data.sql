/* TAULA USUARI */
DROP TABLE IF EXISTS usuari;

CREATE TABLE usuari(
    id                      SERIAL          PRIMARY KEY,
    nom                     VARCHAR         NOT NULL,
    primer_cognom           VARCHAR         NOT NULL,
    segon_cognom            VARCHAR         NOT NULL,
    correu_electronic       VARCHAR         UNIQUE,
    password                VARCHAR         NOT NULL
);

INSERT INTO usuari (id, nom, primer_cognom, segon_cognom, correu_electronic, password) VALUES (
    1, 'Ruben', 'Gil', 'Infante', 'ruben', 'ruben'
);

INSERT INTO usuari (id, nom, primer_cognom, segon_cognom, correu_electronic, password) VALUES (
    2, 'b', 'b', 'b', 'b', 'b'
);

INSERT INTO usuari (id, nom, primer_cognom, segon_cognom, correu_electronic, password) VALUES (
    3, 'a', 'a', 'a', 'a', 'a'
);


/* TAULA APETIT */
DROP TABLE IF EXISTS apetit;

CREATE TABLE apetit (
    id                      SERIAL              PRIMARY KEY,
    afirmatiu               BOOLEAN             NOT NULL,
    esmorzar_acabat         INT                 NOT NULL,
    dinar_acabat            INT                 NOT NULL,
    sopar_acabat            INT                 NOT NULL,
    data                    DATE                NOT NULL DEFAULT CURRENT_TIMESTAMP ,
    usuari                  INT                 NOT NULL,
    CONSTRAINT FK_APETIT_USUARI FOREIGN KEY (usuari)
    REFERENCES usuari (id)
);

/* CANVIS BUCALS */
DROP TABLE IF EXISTS canvis_bucals;

CREATE TABLE canvis_bucals (
    id                      SERIAL          PRIMARY KEY,
    afirmatiu               BOOLEAN         NOT NULL,
    simptomes               VARCHAR         NOT NULL,
    data                    DATE            NOT NULL DEFAULT CURRENT_TIMESTAMP ,
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
    color               VARCHAR         NOT NULL,
    data                DATE            DEFAULT CURRENT_TIMESTAMP ,
    usuari              INT             NOT NULL,
    CONSTRAINT FK_DIARRES_USUARI_ID FOREIGN KEY (usuari)
    REFERENCES usuari (id)
);

/* DOLOR */
DROP TABLE IF EXISTS dolor;

CREATE TABLE DOLOR (
    id              SERIAL          PRIMARY KEY,
    afirmatiu       BOOLEAN         NOT NULL,
    localitzacio    VARCHAR         NOT NULL,
    fatiga          INT             NOT NULL,
    descripcio      VARCHAR         NOT NULL,
    aparicio        VARCHAR         NOT NULL,
    data            DATE            DEFAULT CURRENT_TIMESTAMP ,
    usuari          INT             NOT NULL,
    CONSTRAINT FK_DOLOR_USUARI_ID     FOREIGN KEY(usuari)
    REFERENCES usuari(id)

);

/* FATIGA */
DROP TABLE IF EXISTS fatiga;

CREATE TABLE FATIGA (
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

DROP TABLE IF EXISTS nutricio;

/* NUTRICIO */
CREATE TABLE REESTRENYIMENT (
    id                      SERIAL      PRIMARY KEY,
    ultim_cop_ventre        VARCHAR     NOT NULL,
    color_ultima_femta      VARCHAR     NOT NULL,
    escala_bristol          INT         NOT NULL,
    data                    DATE        DEFAULT CURRENT_TIMESTAMP ,
    usuari                  INT         NOT NULL,
    CONSTRAINT FK_REESTRENYIMENT_USUARI_ID FOREIGN KEY (usuari)
    REFERENCES USUARI (id)
);

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

/* EVENT COMUNITAT */
DROP TABLE IF EXISTS EVENT_COMUNITAT;

CREATE TABLE EVENT_COMUNITAT (
    id                      SERIAL      PRIMARY KEY,
    data                    DATE        NOT NULL,
    numero_telefon          VARCHAR     NOT NULL,
    descripcio              VARCHAR     NOT NULL
);
