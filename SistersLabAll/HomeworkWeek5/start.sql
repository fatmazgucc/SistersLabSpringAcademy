bu haftaki odevde bir kutuphaneyi veritabani olarak tasarlamayi deneyin. Neler olabilecegi tamamen size kalmis, ama ogrendiklerimizi mumkun oldugunca kullanmaya calisin.
Bir de islediklerimizi Medium yazisi yazmayi deneyin

CREATE TABLE IF NOT EXISTS public.clients
(
    id integer NOT NULL DEFAULT nextval('clients_id_seq'::regclass),
    first_name character varying COLLATE pg_catalog."default",
    last_name character varying COLLATE pg_catalog."default",
    role character varying COLLATE pg_catalog."default",
    CONSTRAINT clients_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.clients
    OWNER to postgres;

	CREATE TABLE IF NOT EXISTS public.books
(
    id integer NOT NULL,
    name character varying COLLATE pg_catalog."default",
    author character varying COLLATE pg_catalog."default",
    publication_year integer DEFAULT 1900,
	category character varying COLLATE pg_catalog."default",
    CONSTRAINT books_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.books
    OWNER to postgres;

SELECT * FROM public.clients
ORDER BY id ASC

INSERT INTO Clients (id, first_name, last_name, role)
VALUES ('1', 'FZ', 'Guc', 'Engineer');
INSERT INTO Clients (id, first_name, last_name, role)
VALUES ('2', 'HK', 'Guc', 'Engineer');
INSERT INTO Clients (id, first_name, last_name, role)
VALUES ('3', 'Can', 'Arcin', 'Chef');
INSERT INTO Clients (id, first_name, last_name, role)
VALUES ('4', 'Melise', 'Sozbir', 'Student');

SELECT * FROM public.books
ORDER BY id ASC

INSERT INTO BOOKS(id, name, author, publication_year, category)
VALUES ('1', 'Oluyordum, Gecerken Ugradım', 'Can Gurses', '2014','Ask');
INSERT INTO BOOKS(id, name, author, publication_year, category)
VALUES ('2', 'Catı Katı Asıkları', 'Can Gurses', '2017','Ask');
INSERT INTO BOOKS(id, name, author, publication_year, category)
VALUES ('3', 'Bos Koltuk', 'J. K. Rowling', '2012','Gerilim');
INSERT INTO BOOKS(id, name, author, publication_year, category)
VALUES ('4', 'Harry Potter', 'J. K. Rowling', '1998','Macera');