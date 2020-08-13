package com.sparta.eng61.helpers;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoader {
    Properties properties = new Properties();


    private void loadPropertiesFile() {
        try {
            properties.load(new FileReader("src/test/resources/credentials.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername(){
        loadPropertiesFile();
        return properties.getProperty("username");
    }

    public String getPassword(){
        loadPropertiesFile();
        return properties.getProperty("password");
    }

    public String getCandidateName(){
        loadPropertiesFile();
        return properties.getProperty("candidatename");
    }

    public String getCandidateEmail(){
        loadPropertiesFile();
        return properties.getProperty("candidateemail");
    }

    public String getCandidatePassword(){
        loadPropertiesFile();
        return properties.getProperty("candidatepassword");
    }

    public String getRecruiterEmail(){
        loadPropertiesFile();
        return properties.getProperty("recruiteremail");
    }

    public String getRecruiterPassword(){
        loadPropertiesFile();
        return properties.getProperty("recruiterpassword");
    }
}