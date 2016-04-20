INSERT INTO VOIVODESHIP (ID, NAME) VALUES (1, 'Mazowsze');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (2, 'Małopolska');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (3, 'Wielkopolska');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (4, 'Podlasie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (5, 'Zachodniopomorskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (6, 'Kujawskie');
INSERT INTO VOIVODESHIP (ID, NAME) VALUES (7, 'Dolnośląskie');

INSERT INTO CITY (NAME, VOIVODESHIP_ID) VALUES ('Warszawa', 1);
INSERT INTO CITY (NAME, VOIVODESHIP_ID) VALUES ('Kraków', 2);
INSERT INTO CITY (NAME, VOIVODESHIP_ID) VALUES ('Poznań', 3);
INSERT INTO CITY (NAME, VOIVODESHIP_ID) VALUES ('Gdańsk', 4);

INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('1', 'maria', 'jezus', 'jozef', 'krzak');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('2', 'płot', 'kuropatwa', 'wentyl', 'hawaje');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('3', 'http://imageshack.com/a/img921/3155/bHak6q.jpg', 'http://imageshack.com/a/img923/7900/EUZWyI.jpg
', 'http://imageshack.com/a/img924/412/OgvFdv.jpg
', 'http://imageshack.com/a/img923/169/EeWWkM.jpg');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('4', 'płot', 'kuropatwa', 'wentyl', 'hawaje');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('5', 'maria', 'jezus', 'jozef', 'krzak');
INSERT INTO GALLERY (ID, Photo1, Photo2, Photo3, Photo4) VALUES ('6', 'płot', 'kuropatwa', 'wentyl', 'hawaje');


INSERT INTO STUDY_MODE (ID, S, NP, NSN) VALUES (1, TRUE, TRUE, TRUE);
INSERT INTO STUDY_MODE (ID, S, NP, NSN) VALUES (2, FALSE, TRUE, TRUE);

INSERT INTO SCHOOL_TYPE (ID, NAME) VALUES (1, 'Wyższa');
INSERT INTO SCHOOL_TYPE (ID, NAME) VALUES (2, 'Policealna');
INSERT INTO SCHOOL_TYPE (ID, NAME) VALUES (3, 'Językowa');


INSERT INTO SCHOOL (ADDRESS, DESCRIPTION, FAX, IS_PUBLIC, LOGO_URL, NAME, PHONE, WWW, PROMO, CITY_ID, SCHOOL_TYPE_ID, GALLERY_ID)
VALUES
  ('ulica1', 'Opis1', 'fax1', TRUE, 'www.logo.pl1', 'Uniwersytet Jagieloński', 'Phone 1', 'www.uj.pl', '656', 2, 1, 1);
INSERT INTO SCHOOL (ADDRESS, DESCRIPTION, FAX, IS_PUBLIC, LOGO_URL, NAME, PHONE, WWW, PROMO, CITY_ID, SCHOOL_TYPE_ID, GALLERY_ID)
VALUES ('pl. Marii Skłodowskiej-Curie 5', 'opis2', 'fax2', TRUE, 'www.logo.pl2', 'Politechnika Poznańska', 'Phone 2',
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
VALUES ('Aleja Grunwaldzka 238A', 'Opis1', 'fax1', FALSE, 'www.logo.pl1', 'Wyższa Szkoła Bankowa w Gdańsku', 'Phone 1',
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




INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (1, 'Wydział matematyki', 1);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (2, 'Wydział fizyki', 2);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (3, 'Wydział filologi', 3);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (4, 'Wydział mechatroniki', 1);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (5, 'Wydział biologii', 4);
INSERT INTO DEPARTMENT (ID, NAME, SCHOOL_ID) VALUES (6, 'Wydział ekonomii', 5);


INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (1, 1, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (1, 2, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (2, 1, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (2, 2, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (3, 6, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (3, 7, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (4, 8, 1, 1, 1, 1);
INSERT INTO DEPARTMENT_FACULTY (DEPARTMENT_ID, FACULTY_ID, FIRST_LEVEL_BACHELOR_ID, FIRST_LEVEL_ENGINEER_ID, MASTER_LEVEL_ID, UNIFIED_LEVEL_ID)
VALUES (6, 9, 1, 1, 1, 1);



