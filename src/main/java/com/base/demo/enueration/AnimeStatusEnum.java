package com.base.demo.enueration;

public enum AnimeStatusEnum {
    ANIME_STATUS_NOT_DELTE("0","未删除"),
    ANIME_STATUS_DELTE("1","删除");

    private String key;
    private String value;

    AnimeStatusEnum(String key, String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //根据key获取value的值
    public static String getValueByKey(int key){
        for (AnimeStatusEnum s : AnimeStatusEnum.values()) {
            if(s.getKey().equals(key)){
                return s.getValue();
            }
        }
        return "";
    }


    //根据匹配value的值获取key
    public static String getKeyByValue(String channelName){
        for (AnimeStatusEnum s : AnimeStatusEnum.values()) {
            if(channelName.equals(s.getValue())){
                return s.getKey();
            }
        }
        return "";
    }
}
