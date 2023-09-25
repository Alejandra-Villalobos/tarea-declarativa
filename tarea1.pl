% Alejandra Maria Villalobos Amaya 00132820
% Karen Arely Burgos Sigüenza 00043820

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
lugar(mcdonalds).
lugar(cancha_coopefa).
lugar(uno_las_lomas).
lugar(bally_sports_center).
lugar(texaco_coopefa).
lugar(veterinaria_santa_fe).
lugar(dollar_city).
lugar(parque_lomas_san_francisco).
lugar(veterinaria_san_francisco).
lugar(centro_comercial_las_acacias).
lugar(gambeta_los_proceres).
lugar(texaco_loma_linda).
lugar(estadio_cuscatlan).

% CALLES

calle(carretera_panamericana).
calle(alameda_manuel_enrique_araujo).
calle(av_de_la_revolucion).
calle(blvr_sergio_viera_de_mello).
calle(calle_san_jeronimo_emiliani).
calle(calle_antigua_ferrocarril).
calle(calle_del_mediterraneo).
calle(blvr_la_sultana).
calle(los_proceres).
calle(av_infanteria).
calle(calle_jorge_dominguez).
calle(calle_antiguo_motserrat).
calle(colonia_general_arce).
calle(av_albert_einstein).
calle(c_n1).
calle(calle_antigua_a_huizucar).


% Conecta_con/2
% ESTABLECIMIENTOS-CALLES

conecta_con(centro_comercial_bambu, blvr_sergio_viera_de_mello).
conecta_con(blvr_sergio_viera_de_mello, centro_comercial_bambu).

conecta_con(hospital_el_salvador, alameda_manuel_enrique_araujo).
conecta_con(alameda_manuel_enrique_araujo, hospital_el_salvador).

conecta_con(centro_comercial_feria_rosa, alameda_manuel_enrique_araujo).
conecta_con(alameda_manuel_enrique_araujo, centro_comercial_feria_rosa).
conecta_con(centro_comercial_feria_rosa, los_proceres).
conecta_con(los_proceres, centro_comercial_feria_rosa).

conecta_con(colegio_highlands, los_proceres).
conecta_con(los_proceres, colegio_highlands).

conecta_con(carretera_panamericana, instituto_tecnico_emiliani).
conecta_con(instituto_tecnico_emiliani, carretera_panamericana).

conecta_con(carretera_panamericana, multiplaza).
conecta_con(multiplaza, carretera_panamericana).

conecta_con(carretera_panamericana, las_cascadas).
conecta_con(las_cascadas, carretera_panamericana).

conecta_con(calle_san_jeronimo_emiliani, colegio_augusto_walte).
conecta_con(colegio_augusto_walte, calle_san_jeronimo_emiliani).

conecta_con(blvr_la_sultana, hotel_capital).
conecta_con(hotel_capital, blvr_la_sultana).

conecta_con(blvr_la_sultana, uca).
conecta_con(uca, blvr_la_sultana).
conecta_con(los_proceres, uca).
conecta_con(uca, los_proceres).
conecta_con(av_albert_einstein, uca).
conecta_con(uca, av_albert_einstein).

conecta_con(calle_del_mediterraneo, uno_la_sultana).
conecta_con(uno_la_sultana, calle_del_mediterraneo).

conecta_con(calle_del_mediterraneo, escuela_alemana).
conecta_con(escuela_alemana, calle_del_mediterraneo).

conecta_con(calle_jorge_dominguez, la_casa_de_los_vestidos).
conecta_con(la_casa_de_los_vestidos, calle_jorge_dominguez).

conecta_con(colonia_general_arce, cancha_coopefa).
conecta_con(cancha_coopefa, colonia_general_arce).

conecta_con(colonia_general_arce, texaco_coopefa).
conecta_con(texaco_coopefa, colonia_general_arce).
conecta_con(calle_antiguo_montserrat, texaco_coopefa).
conecta_con(texaco_coopefa, calle_antiguo_montserrat).

conecta_con(calle_antiguo_montserrat, veterinaria_santa_fe).
conecta_con(veterinaria_santa_fe, calle_antiguo_montserrat).

conecta_con(calle_antiguo_montserrat, mcdonalds).
conecta_con(mcdonalds, calle_antiguo_montserrat).
conecta_con(los_proceres, mcdonalds).
conecta_con(mcdonalds, los_proceres).

conecta_con(los_proceres, dollar_city).
conecta_con(dollar_city, los_proceres).

conecta_con(av_albert_einstein, bally_sports_center).
conecta_con(bally_sports_center, av_albert_einstein).

conecta_con(av_albert_einstein, uno_las_lomas).
conecta_con(uno_las_lomas, av_albert_einstein).
conecta_con(c_n1, uno_las_lomas).
conecta_con(uno_las_lomas, c_n1).

conecta_con(c_n1, veterinaria_san_francisco).
conecta_con(veterinaria_san_francisco, c_n1).

conecta_con(c_n1, parque_lomas_san_francisco).
conecta_con(parque_lomas_san_francisco, c_n1).

conecta_con(c_n1, gambeta_los_proceres).
conecta_con(gambeta_los_proceres, c_n1).
conecta_con(calle_antigua_a_huizucar, gambeta_los_proceres).
conecta_con(gambeta_los_proceres, calle_antigua_a_huizucar).

conecta_con(calle_antigua_a_huizucar, centro_comercial_las_acacias).
conecta_con(centro_comercial_las_acacias, calle_antigua_a_huizucar).

conecta_con(calle_antigua_a_huizucar, texaco_loma_linda).
conecta_con(texaco_loma_linda, calle_antigua_a_huizucar).

conecta_con(calle_antigua_a_huizucar, estadio_cuscatlan).
conecta_con(estadio_cuscatlan, calle_antigua_a_huizucar).

% CALLES-CALLES
conecta_con(carretera_panamericana, alameda_manuel_enrique_araujo).
conecta_con(alameda_manuel_enrique_araujo, carretera_panamericana).

conecta_con(carretera_panamericana, los_proceres).
conecta_con(los_proceres, carretera_panamericana).

conecta_con(los_proceres, alameda_manuel_enrique_araujo).
conecta_con(alameda_manuel_enrique_araujo, los_proceres).

conecta_con(av_de_la_revolucion, alameda_manuel_enrique_araujo).
conecta_con(alameda_manuel_enrique_araujo, av_de_la_revolucion).

conecta_con(av_de_la_revolucion, blvr_sergio_viera_de_mello).
conecta_con(blvr_sergio_viera_de_mello, av_de_la_revolucion).

conecta_con(calle_san_jeronimo_emiliani, calle_antigua_ferrocarril).
conecta_con(calle_antigua_ferrocarril, calle_san_jeronimo_emiliani).

conecta_con(calle_del_mediterraneo, calle_antigua_ferrocarril).
conecta_con(calle_antigua_ferrocarril, calle_del_mediterraneo).

conecta_con(calle_del_mediterraneo, blvr_la_sultana).
conecta_con(blvr_la_sultana, calle_del_mediterraneo).

conecta_con(blvr_la_sultana, calle_antigua_ferrocarril).
conecta_con(calle_antigua_ferrocarril, blvr_la_sultana).

conecta_con(blvr_la_sultana, los_proceres).
conecta_con(los_proceres, blvr_la_sultana).

conecta_con(av_infanteria, los_proceres).
conecta_con(los_proceres, av_infanteria).

conecta_con(av_infanteria, calle_jorge_dominguez).
conecta_con(calle_jorge_dominguez, av_infanteria).

conecta_con(calle_antiguo_montserrat, los_proceres).
conecta_con(los_proceres, calle_antiguo_montserrat).

conecta_con(calle_antiguo_montserrat, colonia_general_arce).
conecta_con(colonia_general_arce, calle_antiguo_montserrat).

conecta_con(av_albert_einstein, los_proceres).
conecta_con(los_proceres, av_albert_einstein).

conecta_con(av_albert_einstein, c_n1).
conecta_con(c_n1, av_albert_einstein).

conecta_con(los_proceres, c_n1).
conecta_con(c_n1, los_proceres).

conecta_con(los_proceres, calle_antigua_a_huizucar).
conecta_con(calle_antigua_a_huizucar, los_proceres).


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
    assert(eslabon(X)),
    ir_hacia_aux(X, Y),
    writeln(X).

ir_hacia_aux(X, Y):-
    conecta_con(X, Y),
    writeln(Y),
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
    !.

desde_hasta(X, Y, W):-
    ir_hacia(X, Y),
    eslabon(W).
