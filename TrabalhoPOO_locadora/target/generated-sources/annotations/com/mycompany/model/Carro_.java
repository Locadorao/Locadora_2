package com.mycompany.model;

import com.mycompany.model.Alugar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-06-13T16:41:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Carro.class)
public class Carro_ { 

    public static volatile ListAttribute<Carro, Alugar> alugarList;
    public static volatile SingularAttribute<Carro, String> ano;
    public static volatile SingularAttribute<Carro, Short> disponibilidade;
    public static volatile SingularAttribute<Carro, String> cor;
    public static volatile SingularAttribute<Carro, Float> valor;
    public static volatile SingularAttribute<Carro, Integer> id;
    public static volatile SingularAttribute<Carro, String> modelo;
    public static volatile SingularAttribute<Carro, String> descricao;

}