package com.example.expandablerecyclerviewtest;

public class SampleList {

    private String title;

    private int video_img_1_1;
    private String video_1_1_title;
    private int document_img_1_1;
    private String document_1_1_title;
    private String document_1_1_author_title;
    private int video_img_1_2;
    private String video_1_2_title;

    private int document_img_2_1;
    private String document_2_1_title;
    private String document_2_1_author_title;
    private int video_img_2_1;
    private String video_2_1_title;
    private int video_img_2_2;
    private String video_2_2_title;
    private String audio_2_2;

    private String document_4_0_author, video_3_0_title, document_4_0_title;

    private int video_3_0, document_4_0;

    private boolean expanded;

    public SampleList() {
    }

    public SampleList(int video_3_0, String title) {
        this.video_3_0 = video_3_0;
        this.title = title;
        this.expanded = false;
    }

    public SampleList(int document_4_0, String title, String document_4_0_author) {
        this.document_4_0 = document_4_0;
        this.title = title;
        this.document_4_0_author = document_4_0_author;
        this.expanded = false;
    }

    public SampleList(String title, int video_img_1_1, String video_1_1_title, int document_img_1_1,
                      String document_1_1_title, String document_1_1_author_title, int video_img_1_2, String video_1_2_title) {
        this.title = title;
        this.video_img_1_1 = video_img_1_1;
        this.video_1_1_title = video_1_1_title;
        this.document_img_1_1 = document_img_1_1;
        this.document_1_1_title = document_1_1_title;
        this.document_1_1_author_title = document_1_1_author_title;
        this.video_img_1_2 = video_img_1_2;
        this.video_1_2_title = video_1_2_title;
        this.expanded = false;
    }

    public SampleList(String title, int document_img_2_1, String document_2_1_title, String document_2_1_author_title,
                      int video_img_2_1, String video_2_1_title, int video_img_2_2, String video_2_2_title, String audio_2_2) {
        this.title = title;
        this.document_img_2_1 = document_img_2_1;
        this.document_2_1_title = document_2_1_title;
        this.document_2_1_author_title = document_2_1_author_title;
        this.video_img_2_1 = video_img_2_1;
        this.video_2_1_title = video_2_1_title;
        this.video_img_2_2 = video_img_2_2;
        this.video_2_2_title = video_2_2_title;
        this.audio_2_2 = audio_2_2;
        this.expanded = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideo_3_0_title() {
        return video_3_0_title;
    }

    public void setVideo_3_0_title(String video_3_0_title) {
        this.video_3_0_title = video_3_0_title;
    }

    public int getVideo_3_0() {
        return video_3_0;
    }

    public void setVideo_3_0(int video_3_0) {
        this.video_3_0 = video_3_0;
    }

    public int getVideo_img_1_1() {
        return video_img_1_1;
    }

    public void setVideo_img_1_1(int video_img_1_1) {
        this.video_img_1_1 = video_img_1_1;
    }

    public String getVideo_1_1_title() {
        return video_1_1_title;
    }

    public void setVideo_1_1_title(String video_1_1_title) {
        this.video_1_1_title = video_1_1_title;
    }

    public int getDocument_img_1_1() {
        return document_img_1_1;
    }

    public void setDocument_img_1_1(int document_img_1_1) {
        this.document_img_1_1 = document_img_1_1;
    }

    public String getDocument_1_1_title() {
        return document_1_1_title;
    }

    public void setDocument_1_1_title(String document_1_1_title) {
        this.document_1_1_title = document_1_1_title;
    }

    public String getDocument_1_1_author_title() {
        return document_1_1_author_title;
    }

    public void setDocument_1_1_author_title(String document_1_1_author_title) {
        this.document_1_1_author_title = document_1_1_author_title;
    }

    public int getVideo_img_1_2() {
        return video_img_1_2;
    }

    public void setVideo_img_1_2(int video_img_1_2) {
        this.video_img_1_2 = video_img_1_2;
    }

    public String getVideo_1_2_title() {
        return video_1_2_title;
    }

    public void setVideo_1_2_title(String video_1_2_title) {
        this.video_1_2_title = video_1_2_title;
    }

    public int getDocument_img_2_1() {
        return document_img_2_1;
    }

    public void setDocument_img_2_1(int document_img_2_1) {
        this.document_img_2_1 = document_img_2_1;
    }

    public String getDocument_2_1_author_title() {
        return document_2_1_author_title;
    }

    public void setDocument_2_1_author_title(String document_2_1_author_title) {
        this.document_2_1_author_title = document_2_1_author_title;
    }

    public int getVideo_img_2_1() {
        return video_img_2_1;
    }

    public void setVideo_img_2_1(int video_img_2_1) {
        this.video_img_2_1 = video_img_2_1;
    }

    public int getVideo_img_2_2() {
        return video_img_2_2;
    }

    public void setVideo_img_2_2(int video_img_2_2) {
        this.video_img_2_2 = video_img_2_2;
    }

    public String getDocument_2_1_title() {
        return document_2_1_title;
    }

    public void setDocument_2_1_title(String document_2_1_title) {
        this.document_2_1_title = document_2_1_title;
    }

    public String getVideo_2_1_title() {
        return video_2_1_title;
    }

    public void setVideo_2_1_title(String video_2_1_title) {
        this.video_2_1_title = video_2_1_title;
    }

    public String getVideo_2_2_title() {
        return video_2_2_title;
    }

    public void setVideo_2_2_title(String video_2_2_title) {
        this.video_2_2_title = video_2_2_title;
    }

    public String getAudio_2_2() {
        return audio_2_2;
    }

    public void setAudio_2_2(String audio_2_2) {
        this.audio_2_2 = audio_2_2;
    }

    public String getDocument_4_0_author() {
        return document_4_0_author;
    }

    public void setDocument_4_0_author(String document_4_0_author) {
        this.document_4_0_author = document_4_0_author;
    }

    public String getDocument_4_0_title() {
        return document_4_0_title;
    }

    public void setDocument_4_0_title(String document_4_0_title) {
        this.document_4_0_title = document_4_0_title;
    }

    public int getDocument_4_0() {
        return document_4_0;
    }

    public void setDocument_4_0(int document_4_0) {
        this.document_4_0 = document_4_0;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

}
