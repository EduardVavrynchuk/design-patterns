package com.evavrynchuk.structural;

import com.evavrynchuk.structural.data.DataSource;
import com.evavrynchuk.structural.data.FileDataSourceImpl;
import com.evavrynchuk.structural.decorators.CompressionDecoratorImpl;
import com.evavrynchuk.structural.decorators.DataSourceDecorator;
import com.evavrynchuk.structural.decorators.EncryptionDecoratorImpl;

public class Demo {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecoratorImpl(
                new EncryptionDecoratorImpl(
                        new FileDataSourceImpl("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSourceImpl("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
