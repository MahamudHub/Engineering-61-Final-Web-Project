package com.sparta.eng61.propertiesloader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoader {
    Properties properties = new Properties();


    public void loadPropertiesFile() {
        try {
            properties.load(new FileReader("src/test/resources/credentials.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername(){
        return properties.getProperty("username");
    }

    public String getPassword(){
        return properties.getProperty("password");
    }

    public String getCandidateName(){
        return properties.getProperty("candidatename");
    }

    public String getCandidateEmail(){
        return properties.getProperty("candidateemail");
    }

    public String getCandidatePassword(){
        return properties.getProperty("candidatepassword");
    }

    public String getRecruiterEmail(){
        return properties.getProperty("recruiteremail");
    }

    public String getRecruiterPassword(){
        return properties.getProperty("recruiterpassword");
    }
}