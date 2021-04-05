package com.evavrynchuk.structural.data;

import java.io.*;

public class FileDataSourceImpl implements DataSource {
    private String name;

    public FileDataSourceImpl(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        try (OutputStream fos = new FileOutputStream(name)) {
            fos.write(data.getBytes());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(getClass().getClassLoader().getResource(name).getFile());

        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
