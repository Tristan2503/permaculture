drop table plante;
drop table terrain;

create table plante
(
	id int primary key,
	nom text,
	description text,
	temps_pousse int,
	semis_debut date,
	semis_fin date,
	irrigation int check (irrigation in (1,2,3)),
	superficie double,
	couleur varchar(10) check (couleur in ('ROUGE','VERT','Jaune','ORANGE','VIOLET'))
);
create table terrain
(
	id int primary key,
	nom text,
	longueur int,
	largeur int,
	plantes text
);

insert into plante values ('1','tomate','2','legume rouge pousse hors de terre','01:04:2020','31:07:2020','1','1','ROUGE');

insert into terrain values ('1',null,'10','10',null);