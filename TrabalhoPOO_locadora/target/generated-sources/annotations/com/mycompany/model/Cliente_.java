package com.mycompany.model;

import com.mycompany.model.Alugar;
import com.mycompany.model.Endereco;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-06-13T16:41:21", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> senha;
    public static volatile SingularAttribute<Cliente, String> telefone;
    public static volatile ListAttribute<Cliente, Alugar> alugarList;
    public static volatile SingularAttribute<Cliente, Endereco> enderecoid;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, String> email;

}