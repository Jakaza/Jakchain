package com.thembaonrender.jakchain;

import com.thembaonrender.jakchain.utils.StringUtil;
import java.util.Date;
import java.security.MessageDigest;

public class Block {
    private String hash;
    private String previuosHash;
    private String data;
    private Long timeStamp;

    public Block(String hash, String previuosHash, String data, Long timeStamp) {
        this.previuosHash = previuosHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }
    
    public String calculateHash(){
        String calculatedHash = StringUtil.applySha256(
        previuosHash+Long.toString(timeStamp)+data
        );
        return calculatedHash;
    }
}
