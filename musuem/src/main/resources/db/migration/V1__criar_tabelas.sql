CREATE TABLE artista (
                         id              BIGSERIAL PRIMARY KEY,
                         nome            VARCHAR(255) NOT NULL,
                         pseudonimo      VARCHAR(255),
                         sexo            VARCHAR(20),
                         ano_nascimento  INTEGER,
                         ano_falecimento INTEGER
);

CREATE TABLE museu (
                       id                      BIGSERIAL PRIMARY KEY,
                       nome                    VARCHAR(255) NOT NULL,
                       localizacao             VARCHAR(255),
                       fundado                 INTEGER,
                       media_de_visitas_mensal DOUBLE PRECISION,
                       site                    VARCHAR(255)
);

CREATE TABLE obra (
                      id         BIGSERIAL PRIMARY KEY,
                      titulo     VARCHAR(255) NOT NULL,
                      tamanho    VARCHAR(100),
                      ano        INTEGER,
                      tipo       VARCHAR(30) NOT NULL,
                      artista_id BIGINT NOT NULL REFERENCES artista (id),
                      museu_id   BIGINT REFERENCES museu (id)
);

CREATE INDEX idx_obra_artista ON obra (artista_id);
CREATE INDEX idx_obra_museu   ON obra (museu_id);
CREATE INDEX idx_obra_tipo    ON obra (tipo);
