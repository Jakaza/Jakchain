package com.thembaonrender.jakchain;

import java.util.Date;
import java.security.MessageDigest;

public class Block {
    private String hash;
    private String previuosHash;
    private String data;
    private Long timeStamp;

    public Block(String hash, String previuosHash, String data, Long timeStamp) {
        this.hash = hash;
        this.previuosHash = previuosHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
    }
}
