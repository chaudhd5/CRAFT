package manager;

import dataProvider.ConfigsFileReader;

public class FileReaderManager {
 
 private static FileReaderManager fileReaderManager = new FileReaderManager();
 private static ConfigsFileReader configFileReader;
 
 private FileReaderManager() {
 }
 
 public static FileReaderManager getInstance( ) {
       return fileReaderManager;
 }
 
 public ConfigsFileReader getConfigReader() {
 return (configFileReader == null) ? new ConfigsFileReader() : configFileReader;
 }
}