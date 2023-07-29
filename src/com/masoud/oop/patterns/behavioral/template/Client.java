package com.masoud.oop.patterns.behavioral.template;

import com.masoud.oop.patterns.behavioral.template.a.DataPersistence;
import com.masoud.oop.patterns.behavioral.template.b.NoSqlPersistence;
import com.masoud.oop.patterns.behavioral.template.b.SqlPersistence;

public class Client {
    public static void main(String[] args) {

        DataPersistence sqlApproach = new SqlPersistence();
        sqlApproach.persist();

        DataPersistence noSqlApproach = new NoSqlPersistence();
        noSqlApproach.persist();
    }
}
