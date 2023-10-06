% Alejandra Maria Villalobos Amaya 00132820
% Karen Arely Burgos Sig enza 00043820

% Lugares/1
% ESTABLECIMIENTOS

lugar(centro_comercial_bambu).
lugar(hospital_el_salvador).
lugar(colegio_highlands).
lugar(instituto_tecnico_emiliani).
lugar(multiplaza).
lugar(las_cascadas).
lugar(centro_comercial_feria_rosa).
lugar(colegio_augusto_walte).
lugar(la_casa_de_los_vestidos).
lugar(hotel_capital).
lugar(uno_la_sultana).
lugar(escuela_alemana).
lugar(uca).
lugar(cancha_coopefa).
lugar(parque_de_pelotas).
lugar(uno_las_lomas).
lugar(bally_sports_center).
lugar(texaco_coopefa).
lugar(escuela_militar).
lugar(parque_lomas_san_francisco).
lugar(veterinaria_san_francisco).
lugar(centro_comercial_las_acacias).
lugar(gambeta_los_proceres).
lugar(texaco_loma_linda).
lugar(estadio_cuscatlan).


% CALLES

calle(av_las_mercedes_1).
calle(av_las_mercedes_2).

calle(calle_capitan_douglas_varela).

calle(av_independecia_1).
calle(av_independecia_2).

calle(carretera_panamericana_1).
calle(carretera_panamericana_2).
calle(carretera_panamericana_3).

calle(alameda_manuel_enrique_araujo_1).
calle(alameda_manuel_enrique_araujo_2).
calle(alameda_manuel_enrique_araujo_3).
calle(alameda_manuel_enrique_araujo_4).

calle(av_de_la_revolucion).

calle(blvr_sergio_viera_de_mello).

calle(calle_san_jeronimo_emiliani).

calle(calle_antigua_ferrocarril).

calle(calle_del_mediterraneo_1).
calle(calle_del_mediterraneo_2).

calle(blvr_la_sultana_1).
calle(blvr_la_sultana_2).
calle(blvr_la_sultana_3).

calle(los_proceres_1).
calle(los_proceres_2).
calle(los_proceres_3).
calle(los_proceres_4).
calle(los_proceres_5).
calle(los_proceres_6).
calle(los_proceres_7).
calle(los_proceres_8).
calle(los_proceres_9).
calle(los_proceres_10).

calle(calle_jorge_dominguez).

calle(colonia_general_arce).

calle(av_albert_einstein_1).
calle(av_albert_einstein_2).
calle(av_albert_einstein_3).

calle(c_n1_1).
calle(c_n1_2).
calle(c_n1_3).
calle(c_n1_4).

calle(calle_antigua_a_huizucar_1).
calle(calle_antigua_a_huizucar_2).
calle(calle_antigua_a_huizucar_3).

calle(calle_uca).

% Conecta_con/2
% ESTABLECIMIENTOS-CALLES

conecta_con(escuela_militar, av_independecia_1).
conecta_con(av_independecia_1, escuela_militar).

conecta_con(cancha_coopefa, calle_capitan_douglas_varela).
conecta_con(calle_capitan_douglas_varela, cancha_coopefa).

conecta_con(parque_de_pelotas, alameda_manuel_enrique_araujo_4).
conecta_con(alameda_manuel_enrique_araujo_4, parque_de_pelotas).

conecta_con(centro_comercial_bambu, blvr_sergio_viera_de_mello).
conecta_con(blvr_sergio_viera_de_mello, centro_comercial_bambu).

conecta_con(hospital_el_salvador, alameda_manuel_enrique_araujo_2).
conecta_con(alameda_manuel_enrique_araujo_2, hospital_el_salvador).

conecta_con(centro_comercial_feria_rosa, alameda_manuel_enrique_araujo_1).
conecta_con(alameda_manuel_enrique_araujo_1, centro_comercial_feria_rosa).
conecta_con(centro_comercial_feria_rosa, alameda_manuel_enrique_araujo_2).
conecta_con(alameda_manuel_enrique_araujo_2, centro_comercial_feria_rosa).
conecta_con(centro_comercial_feria_rosa, los_proceres_2).
conecta_con(los_proceres_2, centro_comercial_feria_rosa).
conecta_con(centro_comercial_feria_rosa, los_proceres_3).
conecta_con(los_proceres_3, centro_comercial_feria_rosa).

conecta_con(colegio_highlands, los_proceres_1).
conecta_con(los_proceres_1, colegio_highlands).

conecta_con(carretera_panamericana_2, instituto_tecnico_emiliani).
conecta_con(instituto_tecnico_emiliani, carretera_panamericana_2).
conecta_con(carretera_panamericana_3, instituto_tecnico_emiliani).
conecta_con(instituto_tecnico_emiliani, carretera_panamericana_3).

conecta_con(carretera_panamericana_1, multiplaza).
conecta_con(multiplaza, carretera_panamericana_1).
conecta_con(carretera_panamericana_2, multiplaza).
conecta_con(multiplaza, carretera_panamericana_2).

conecta_con(carretera_panamericana_1, las_cascadas).
conecta_con(las_cascadas, carretera_panamericana_1).

conecta_con(calle_san_jeronimo_emiliani, colegio_augusto_walte).
conecta_con(colegio_augusto_walte, calle_san_jeronimo_emiliani).

conecta_con(blvr_la_sultana_2, hotel_capital).
conecta_con(hotel_capital, blvr_la_sultana_2).
conecta_con(blvr_la_sultana_3, hotel_capital).
conecta_con(hotel_capital, blvr_la_sultana_3).

conecta_con(blvr_la_sultana_1, calle_uca).
conecta_con(calle_uca, blvr_la_sultana_1).
conecta_con(blvr_la_sultana_2, calle_uca).
conecta_con(calle_uca, blvr_la_sultana_2).

conecta_con(uca, calle_uca).
conecta_con(calle_uca, uca).
conecta_con(los_proceres_4, uca).
conecta_con(uca, los_proceres_4).
conecta_con(los_proceres_5, uca).
conecta_con(uca, los_proceres_5).
conecta_con(av_albert_einstein_1, uca).
conecta_con(uca, av_albert_einstein_1).
conecta_con(av_albert_einstein_2, uca).
conecta_con(uca, av_albert_einstein_2).

conecta_con(calle_del_mediterraneo_2, uno_la_sultana).
conecta_con(uno_la_sultana, calle_del_mediterraneo_2).
conecta_con(uno_la_sultana, calle_antigua_ferrocarril).
conecta_con(calle_antigua_ferrocarril, uno_la_sultana).
conecta_con(uno_la_sultana, blvr_la_sultana_1).
conecta_con(blvr_la_sultana_1, uno_la_sultana).

conecta_con(calle_del_mediterraneo_1, escuela_alemana).
conecta_con(escuela_alemana, calle_del_mediterraneo_1).
conecta_con(calle_del_mediterraneo_2, escuela_alemana).
conecta_con(escuela_alemana, calle_del_mediterraneo_2).

conecta_con(calle_jorge_dominguez, la_casa_de_los_vestidos).
conecta_con(la_casa_de_los_vestidos, calle_jorge_dominguez).

conecta_con(colonia_general_arce, cancha_coopefa).
conecta_con(cancha_coopefa, colonia_general_arce).

conecta_con(colonia_general_arce, texaco_coopefa).
conecta_con(texaco_coopefa, colonia_general_arce).

conecta_con(av_albert_einstein_2, bally_sports_center).
conecta_con(bally_sports_center, av_albert_einstein_2).
conecta_con(av_albert_einstein_3, bally_sports_center).
conecta_con(bally_sports_center, av_albert_einstein_3).

conecta_con(av_albert_einstein_1, uno_las_lomas).
conecta_con(uno_las_lomas, av_albert_einstein_1).
conecta_con(c_n1_1, uno_las_lomas).
conecta_con(uno_las_lomas, c_n1_1).

conecta_con(c_n1_1, veterinaria_san_francisco).
conecta_con(veterinaria_san_francisco, c_n1_1).
conecta_con(c_n1_2, veterinaria_san_francisco).
conecta_con(veterinaria_san_francisco, c_n1_2).

conecta_con(c_n1_2, parque_lomas_san_francisco).
conecta_con(parque_lomas_san_francisco, c_n1_2).
conecta_con(c_n1_3, parque_lomas_san_francisco).
conecta_con(parque_lomas_san_francisco, c_n1_3).

conecta_con(c_n1_3, gambeta_los_proceres).
conecta_con(gambeta_los_proceres, c_n1_3).
conecta_con(c_n1_4, gambeta_los_proceres).
conecta_con(gambeta_los_proceres, c_n1_4).

conecta_con(calle_antigua_a_huizucar_1, centro_comercial_las_acacias).
conecta_con(centro_comercial_las_acacias, calle_antigua_a_huizucar_1).

conecta_con(calle_antigua_a_huizucar_1, texaco_loma_linda).
conecta_con(texaco_loma_linda, calle_antigua_a_huizucar_1).
conecta_con(calle_antigua_a_huizucar_2, texaco_loma_linda).
conecta_con(texaco_loma_linda, calle_antigua_a_huizucar_2).

conecta_con(calle_antigua_a_huizucar_2, estadio_cuscatlan).
conecta_con(estadio_cuscatlan, calle_antigua_a_huizucar_2).
conecta_con(calle_antigua_a_huizucar_3, estadio_cuscatlan).
conecta_con(estadio_cuscatlan, calle_antigua_a_huizucar_3).

% CALLES-CALLES
conecta_con(av_independecia_2, calle_jorge_dominguez).
conecta_con(calle_jorge_dominguez, av_independecia_2).

conecta_con(av_las_mercedes_1, alameda_manuel_enrique_araujo_4).
conecta_con(alameda_manuel_enrique_araujo_4, av_las_mercedes_1).

conecta_con(av_independecia_1, av_las_mercedes_1).
conecta_con(av_las_mercedes_1, av_independecia_1).

conecta_con(calle_capitan_douglas_varela, av_las_mercedes_2).
conecta_con(av_las_mercedes_2, calle_capitan_douglas_varela).

conecta_con(calle_capitan_douglas_varela, colonia_general_arce).
conecta_con(colonia_general_arce, calle_capitan_douglas_varela).

conecta_con(carretera_panamericana_3, alameda_manuel_enrique_araujo_1).
conecta_con(alameda_manuel_enrique_araujo_1, carretera_panamericana_3).

conecta_con(carretera_panamericana_3, los_proceres_1).
conecta_con(los_proceres_1, carretera_panamericana_3).
conecta_con(carretera_panamericana_3, los_proceres_2).
conecta_con(los_proceres_2, carretera_panamericana_3).

conecta_con(los_proceres_1, alameda_manuel_enrique_araujo_1).
conecta_con(alameda_manuel_enrique_araujo_1, los_proceres_1).
conecta_con(los_proceres_2, alameda_manuel_enrique_araujo_1).
conecta_con(alameda_manuel_enrique_araujo_1, los_proceres_2).

conecta_con(av_de_la_revolucion, alameda_manuel_enrique_araujo_3).
conecta_con(alameda_manuel_enrique_araujo_3, av_de_la_revolucion).

conecta_con(av_de_la_revolucion, blvr_sergio_viera_de_mello).
conecta_con(blvr_sergio_viera_de_mello, av_de_la_revolucion).

conecta_con(calle_san_jeronimo_emiliani, calle_antigua_ferrocarril).
conecta_con(calle_antigua_ferrocarril, calle_san_jeronimo_emiliani).

conecta_con(calle_san_jeronimo_emiliani, calle_del_mediterraneo_2).
conecta_con(calle_del_mediterraneo_2, calle_san_jeronimo_emiliani).

conecta_con(calle_del_mediterraneo_2, calle_antigua_ferrocarril).
conecta_con(calle_antigua_ferrocarril, calle_del_mediterraneo_2).

conecta_con(calle_del_mediterraneo_2, blvr_la_sultana_1).
conecta_con(blvr_la_sultana_1, calle_del_mediterraneo_2).

conecta_con(blvr_la_sultana_1, calle_antigua_ferrocarril).
conecta_con(calle_antigua_ferrocarril, blvr_la_sultana_1).

conecta_con(blvr_la_sultana_3, los_proceres_3).
conecta_con(los_proceres_3, blvr_la_sultana_3).
conecta_con(blvr_la_sultana_3, los_proceres_4).
conecta_con(los_proceres_4, blvr_la_sultana_3).

conecta_con(av_albert_einstein_3, los_proceres_7).
conecta_con(los_proceres_7, av_albert_einstein_3).

conecta_con(av_albert_einstein_1, c_n1_1).
conecta_con(c_n1_1, av_albert_einstein_1).

conecta_con(los_proceres_9, c_n1_4).
conecta_con(c_n1_4, los_proceres_9).

% SUBCALLES
conecta_con(carretera_panamericana_1, carretera_panamericana_2).
conecta_con(carretera_panamericana_2, carretera_panamericana_1).
conecta_con(carretera_panamericana_2, carretera_panamericana_3).
conecta_con(carretera_panamericana_3, carretera_panamericana_2).

conecta_con(alameda_manuel_enrique_araujo_1, alameda_manuel_enrique_araujo_2).
conecta_con(alameda_manuel_enrique_araujo_2, alameda_manuel_enrique_araujo_1).
conecta_con(alameda_manuel_enrique_araujo_2, alameda_manuel_enrique_araujo_3).
conecta_con(alameda_manuel_enrique_araujo_3, alameda_manuel_enrique_araujo_2).
conecta_con(alameda_manuel_enrique_araujo_3, alameda_manuel_enrique_araujo_4).
conecta_con(alameda_manuel_enrique_araujo_4, alameda_manuel_enrique_araujo_3).

conecta_con(calle_del_mediterraneo_1, calle_del_mediterraneo_2).
conecta_con(calle_del_mediterraneo_2, calle_del_mediterraneo_1).

conecta_con(blvr_la_sultana_1, blvr_la_sultana_2).
conecta_con(blvr_la_sultana_2, blvr_la_sultana_1).
conecta_con(blvr_la_sultana_2, blvr_la_sultana_3).
conecta_con(blvr_la_sultana_3, blvr_la_sultana_2).

conecta_con(av_albert_einstein_1, av_albert_einstein_2).
conecta_con(av_albert_einstein_2, av_albert_einstein_1).
conecta_con(av_albert_einstein_2, av_albert_einstein_3).
conecta_con(av_albert_einstein_3, av_albert_einstein_2).

conecta_con(c_n1_1, c_n1_2).
conecta_con(c_n1_2, c_n1_1).
conecta_con(c_n1_2, c_n1_3).
conecta_con(c_n1_3, c_n1_2).
conecta_con(c_n1_3, c_n1_4).
conecta_con(c_n1_4, c_n1_3).

conecta_con(calle_antigua_a_huizucar_1, calle_antigua_a_huizucar_2).
conecta_con(calle_antigua_a_huizucar_2, calle_antigua_a_huizucar_1).
conecta_con(calle_antigua_a_huizucar_2, calle_antigua_a_huizucar_3).
conecta_con(calle_antigua_a_huizucar_3, calle_antigua_a_huizucar_2).
conecta_con(calle_antigua_a_huizucar_3, calle_antigua_a_huizucar_4).
conecta_con(calle_antigua_a_huizucar_4, calle_antigua_a_huizucar_3).

conecta_con(av_las_mercedes_1, av_las_mercedes_2).
conecta_con(av_las_mercedes_2, av_las_mercedes_1).

conecta_con(av_independecia_1, av_independecia_2).
conecta_con(av_independecia_2, av_independecia_1).

conecta_con(los_proceres_1, los_proceres_2).
conecta_con(los_proceres_2, los_proceres_1).
conecta_con(los_proceres_2, los_proceres_3).
conecta_con(los_proceres_3, los_proceres_2).
conecta_con(los_proceres_3, los_proceres_4).
conecta_con(los_proceres_4, los_proceres_3).
conecta_con(los_proceres_4, los_proceres_5).
conecta_con(los_proceres_5, los_proceres_4).
conecta_con(los_proceres_5, los_proceres_6).
conecta_con(los_proceres_6, los_proceres_5).
conecta_con(los_proceres_6, los_proceres_7).
conecta_con(los_proceres_7, los_proceres_6).
conecta_con(los_proceres_7, los_proceres_8).
conecta_con(los_proceres_8, los_proceres_7).
conecta_con(los_proceres_8, los_proceres_9).
conecta_con(los_proceres_9, los_proceres_8).
conecta_con(los_proceres_9, los_proceres_10).
conecta_con(los_proceres_10, los_proceres_9).


% Validar lugar X

ir_hacia(X, _):-
    not(lugar(X)),
    writeln("Primer lugar no encontrado"), !, fail.

% Validar lugar Y

ir_hacia(_, Y):-
    not(lugar(Y)),
    writeln("Segundo lugar no encontrado"), !, fail.

ir_hacia(X, Y):-
    abolish(eslabon, 1),
    abolish(route, 1),
    assert(eslabon(X)),
    ir_hacia_aux(X, Y),
    writeln(X),
    assert(route(X)).

ir_hacia_aux(X, Y):-
    conecta_con(X, Y),
    writeln(Y),
    assert(route(Y)),
    assert(eslabon(Y)),
    !.

ir_hacia_aux(X, _):-
    conecta_con(X, Z),
    eslabon(Z),
    fail.

ir_hacia_aux(X, Y):-
    conecta_con(X, Z),
    calle(Z),
    not(eslabon(Z)),
    assert(eslabon(Z)),
    ir_hacia_aux(Z, Y),
    writeln(Z),
    assert(route(Z)),
    !.

desde_hasta(X, Y, W):-
    ir_hacia(X, Y),
    route(W).
