INSERT INTO VOIVODESHIP (ID, NAME) VALUES (1, 'Mazowieckie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (2, 'Małopolskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (3, 'Wielkopolskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (4, 'Podlaskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (5, 'Zachodniopomorskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (6, 'Kujawsko-pomorskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (7, 'Dolnośląskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (8, 'Slaskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (9, 'Warmińsko-mazurskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (10, 'Lubuskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (11, 'Opolskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (12, 'Lodzkie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (13, 'Pomorskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (14, 'Swietokrzyskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (15, 'Podkarpackie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (16, 'Lubelskie');

INSERT INTO CITY (NAME, VOIVODESHIP_ID) VALUES ('Warszawa', 1);
INSERT INTO CITY (NAME, VOIVODESHIP_ID) VALUES ('Kraków', 2);
INSERT INTO CITY (NAME, VOIVODESHIP_ID) VALUES ('Poznań', 3);
INSERT INTO CITY (NAME, VOIVODESHIP_ID) VALUES ('Gdańsk', 4);

INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('1', 'http://imagizer.imageshack.us/v2/640x480q90/923/vPEVHq.jpg
', 'http://imagizer.imageshack.us/v2/640x480q90/921/IjyIjN.jpg
', 'http://imagizer.imageshack.us/v2/640x480q90/924/sFWsb8.jpg
', 'http://imagizer.imageshack.us/v2/640x480q90/923/l5nWwB.jpg');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('2', 'http://imageshack.com/a/img923/8158/cA3zKi.jpg
', 'http://imageshack.com/a/img923/8960/ufbBdJ.jpg
', 'http://imageshack.com/a/img921/7893/3tNxnk.jpg
', 'http://imageshack.com/a/img921/7060/9qr9nt.jpg');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('3', 'http://imageshack.com/a/img921/3155/bHak6q.jpg', 'http://imageshack.com/a/img923/7900/EUZWyI.jpg
', 'http://imageshack.com/a/img923/8960/ufbBdJ.jpg', 'http://imageshack.com/a/img923/169/EeWWkM.jpg');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('4', '1', '2', '3', '4');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('5', 'http://imageshack.com/a/img924/9438/3ky6V4.jpg
', 'http://imageshack.com/a/img922/4927/2OwJXE.jpg
', 'http://imageshack.com/a/img924/2742/2hXCl4.jpg
', 'http://imageshack.com/a/img924/4574/6w6bQc.jpg');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('6', '1', '2', '3', '4');


INSERT INTO STUDY_MODE (ID, S, NP, NSN) VALUES (1, TRUE, TRUE, TRUE);
INSERT INTO STUDY_MODE (ID, S, NP, NSN) VALUES (2, FALSE, TRUE, TRUE);

INSERT INTO SCHOOL_TYPE (ID, NAME) VALUES (1, 'Wyższa');
INSERT INTO SCHOOL_TYPE (ID, NAME) VALUES (2, 'Policealna');
INSERT INTO SCHOOL_TYPE (ID, NAME) VALUES (3, 'Językowa');


INSERT INTO SCHOOL (ADDRESS, DESCRIPTION, FAX, IS_PUBLIC, LOGO_URL, NAME, PHONE, WWW, PROMO, CITY_ID, SCHOOL_TYPE_ID, GALLERY_ID)
VALUES
  ('ulica1', 'Opis1', 'fax1', TRUE, 'http://imagizer.imageshack.us/v2/640x480q90/923/NdeJWo.png',
             'Uniwersytet Jagieloński', 'Phone 1', 'www.uj.pl', '656', 2, 1, 1);
INSERT INTO SCHOOL (ADDRESS, DESCRIPTION, FAX, IS_PUBLIC, LOGO_URL, NAME, PHONE, WWW, PROMO, CITY_ID, SCHOOL_TYPE_ID, GALLERY_ID)
VALUES ('pl. Marii Skłodowskiej-Curie 5', 'opis2', 'fax2', TRUE, 'http://imageshack.com/a/img922/8829/MiDF2S.png
', 'Politechnika Poznańska', 'Phone 2',
                                          'www.put.poznan.pl', '33', 3, 1, 2);
INSERT INTO SCHOOL (ADDRESS, DESCRIPTION, FAX, IS_PUBLIC, LOGO_URL, NAME, PHONE, WWW, PROMO, CITY_ID, SCHOOL_TYPE_ID, GALLERY_ID)
VALUES ('ul. Chodakowska 19/31',
  'SWPS Uniwersytet Humanistycznospołeczny to nowoczesne centrum naukowo-dydaktyczne, które oferuje interdyscyplinarne studia społeczno-humanistyczne. Od 19 lat uczelnia jest jednym z najważniejszych ośrodków studiów psychologicznych w kraju.',
  'fax3', FALSE, 'http://imageshack.com/a/img924/4769/az1eel.png', 'Szkoła Wyższa Psychologii Społecznej',
  '22 517 96 00 ', 'www.swps.pl', '21', 1, 1, 3);
INSERT INTO SCHOOL (ADDRESS, DESCRIPTION, FAX, IS_PUBLIC, LOGO_URL, NAME, PHONE, WWW, PROMO, CITY_ID, SCHOOL_TYPE_ID, GALLERY_ID)
VALUES ('ulica4', 'opis4', 'fax4', FALSE, 'www.logo.pl4', 'Językowa szkoła4', 'Phone 4', 'www.ws.pl4', '23', 3, 3, 4);
INSERT INTO SCHOOL (ADDRESS, DESCRIPTION, FAX, IS_PUBLIC, LOGO_URL, NAME, PHONE, WWW, PROMO, CITY_ID, SCHOOL_TYPE_ID, GALLERY_ID)
VALUES ('ul. Jagiellońska 57/59',
  'Akademia Leona Koźmińskiego to niepubliczna uczelnia wyższa. W latach 1993-2008 funkcjonowała pod nazwą Wyższa Szkoła Przedsiębiorczości i Zarządzania. Kształci studentów w zakresie nauk ekonomicznych, humanistycznych i prawnych.',
  'fax5', FALSE, 'http://imageshack.com/a/img924/8931/aPKphP.jpg', 'Akademia Leona Koźmińskiego', '519-21-00  ',
  'http://www.kozminski.edu.pl', '22', 1, 1, 5);
INSERT INTO SCHOOL (ADDRESS, DESCRIPTION, FAX, IS_PUBLIC, LOGO_URL, NAME, PHONE, WWW, PROMO, CITY_ID, SCHOOL_TYPE_ID, GALLERY_ID)
VALUES ('Aleja Grunwaldzka 238A', 'Opis1', 'fax1', FALSE,
                                  'http://www.wsb.pl/gdansk/sites/gdansk.nowestrony.sandbox.dti.teb-akademia.pl/files/default_images/dla_prasy/materialy_dla_mediow/logo_wsb_pion.jpg',
                                  'Wyższa Szkoła Bankowa w Gdańsku', 'Phone 1',
                                  'www.wsb.pl', '7', 4, 1, 6);


INSERT INTO FACULTY (ID, NAME) VALUES (1, 'Matematyka');
INSERT INTO FACULTY (ID, NAME) VALUES (2, 'Informatyka');
INSERT INTO FACULTY (ID, NAME) VALUES (3, 'Biologia');
INSERT INTO FACULTY (ID, NAME) VALUES (4, 'Fizyka');
INSERT INTO FACULTY (ID, NAME) VALUES (5, 'Geografia');
INSERT INTO FACULTY (ID, NAME) VALUES (6, 'Filologia angielska');
INSERT INTO FACULTY (ID, NAME) VALUES (7, 'Iberystyka');
INSERT INTO FACULTY (ID, NAME) VALUES (8, 'Mechatronika');
INSERT INTO FACULTY (ID, NAME) VALUES (9, 'Ekonomia');
INSERT INTO FACULTY (ID, NAME) VALUES (10, 'Filologia rosyjska');
INSERT INTO FACULTY (ID, NAME) VALUES (11, 'Filologia niemiecka');


INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (1, 'Wydział matematyki', 2);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (2, 'Wydział fizyki', 2);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (3, 'Wydział filologi', 4);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (4, 'Wydział mechatroniki', 2);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (5, 'Wydział biologii', 3);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (6, 'Wydział ekonomii', 5);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (7, 'Wydział polonistyki', 1);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (8, 'Wydział zarządzania', 6);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (9, 'Wydział geografii', 1);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (10, 'Wydział informatyki', 6);



INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (1, 1, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (1, 2, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (2, 4, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (3, 11, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (3, 6, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (3, 7, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (4, 8, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (6, 9, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (8, 9, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (3, 10, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (5, 3, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (9, 5, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (10, 2, 1, 1, 1, 1);

INSERT INTO USER (FIRST_NAME, LOGIN, PASSWORD) VALUES ('asd', 'asd', 'asd');
INSERT INTO USER (FIRST_NAME, LOGIN, PASSWORD) VALUES ('qwe', 'qwe', 'qwe');
INSERT INTO USER (FIRST_NAME, LOGIN, PASSWORD) VALUES ('q', 'q', 'q');
INSERT INTO USER (FIRST_NAME, LOGIN, PASSWORD) VALUES ('a', 'a', 'a');
