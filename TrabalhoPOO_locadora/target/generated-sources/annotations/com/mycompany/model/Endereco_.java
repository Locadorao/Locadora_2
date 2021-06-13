package com.mycompany.model;

import com.mycompany.model.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-06-13T16:41:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile ListAttribute<Endereco, Cliente> clienteList;
    public static volatile SingularAttribute<Endereco, String> cidade;
    public static volatile SingularAttribute<Endereco, String> estado;
    public static volatile SingularAttribute<Endereco, Integer> id;
    public static volatile SingularAttribute<Endereco, String> rua;

}