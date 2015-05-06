package com.jmj_studio.project;

/**
 * Created by Asia on 03.05.2015.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.*;

public class DataProvider{

    public static HashMap<String, List<String>> getInfo(){
        HashMap<String, List<String>> GalleryDetails= new HashMap <String, List<String>>();

        List<String> Landscapes = new ArrayList<String>();
        Landscapes.add("landscape1");
        Landscapes.add("landscape2");

        List<String> Portraits= new ArrayList<String>();
        Portraits.add("portrait1");
        Portraits.add("portrait2");

        List<String> Animals= new ArrayList<String>();
        Animals.add("animals1");

        List<String> Flowers=new ArrayList <String>();
        Flowers.add("flower1");
        Flowers.add("flower2");
        Flowers.add("flower3");

        List <String> CameraPhotos = new ArrayList<String>();

        GalleryDetails.put("Landscapes", Landscapes);
        GalleryDetails.put("Portraits", Portraits);
        GalleryDetails.put("Animals", Animals);
        GalleryDetails.put("Flowers", Flowers);
        GalleryDetails.put("Camera Photos", CameraPhotos);

        return GalleryDetails;
    }
}
