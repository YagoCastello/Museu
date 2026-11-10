-- Dados de exemplo. As visitas mensais sao valores aproximados, apenas ilustrativos.
INSERT INTO artista (nome, pseudonimo, sexo, ano_nascimento, ano_falecimento) VALUES
                                                                                  ('Leonardo di ser Piero da Vinci', 'Leonardo da Vinci', 'M', 1452, 1519),
                                                                                  ('Michelangelo di Lodovico Buonarroti Simoni', 'Michelangelo', 'M', 1475, 1564),
                                                                                  ('Vincent Willem van Gogh', 'Van Gogh', 'M', 1853, 1890),
                                                                                  ('Tarsila do Amaral', 'Tarsila', 'F', 1886, 1973),
                                                                                  ('Magdalena Carmen Frida Kahlo Calderon', 'Frida Kahlo', 'F', 1907, 1954);

INSERT INTO museu (nome, localizacao, fundado, media_de_visitas_mensal, site) VALUES
                                                                                  ('Museu do Louvre', 'Paris, Franca', 1793, 700000, 'https://www.louvre.fr'),
                                                                                  ('Museu Van Gogh', 'Amsterda, Holanda', 1973, 130000, 'https://www.vangoghmuseum.com'),
                                                                                  ('MALBA', 'Buenos Aires, Argentina', 2001, 40000, 'https://malba.org.ar');

INSERT INTO obra (titulo, tamanho, ano, tipo, artista_id, museu_id) VALUES
                                                                        ('Mona Lisa', '77 x 53 cm', 1503, 'PINTURA', 1, 1),
                                                                        ('Escravo Moribundo', '215 cm de altura', 1513, 'ESCULTURA', 2, 1),
                                                                        ('A Moldura', '29 x 22 cm', 1938, 'PINTURA', 5, 1),
                                                                        ('Os Comedores de Batatas', '82 x 114 cm', 1885, 'PINTURA', 3, 2),
                                                                        ('Girassois', '95 x 73 cm', 1889, 'PINTURA', 3, 2),
                                                                        ('Abaporu', '85 x 73 cm', 1928, 'PINTURA', 4, 3);
