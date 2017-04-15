package com.example.somina.myapp14;


class DataHandler {

    private int id, vote_count;
    private String name;

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    int getVote_count() {
        return vote_count;
    }

    void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}