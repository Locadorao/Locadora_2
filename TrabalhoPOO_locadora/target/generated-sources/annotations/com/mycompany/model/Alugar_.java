package com.mycompany.model;

import com.mycompany.model.Carro;
import com.mycompany.model.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-06-13T16:41:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Alugar.class)
public class Alugar_ { 

    public static volatile SingularAttribute<Alugar, Cliente> clienteid;
    public static volatile SingularAttribute<Alugar, Carro> carroid;
    public static volatile SingularAttribute<Alugar, Integer> tempoAlugado;
    public static volatile SingularAttribute<Alugar, Integer> id;

}