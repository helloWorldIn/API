package models;

import lombok.Data;

@Data
public class GetIdModelIdKandinsky {

    private String queueType;
    private String items;
    private String query;
    private int width;
    private int height;
    private int num_steps;
    private int num_images;
    private int guidance_scale;
    private String preset;

}
