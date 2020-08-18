package com.billings.disney_at_home;

import java.util.Arrays;

public enum UserPlaylist {

    //https://www.youtube.com/watch?v=5mG7tiv_Dto&list=PL351kuEPXTjHxpeBBCLFlwgTzf7KHYC6b

    ALICA("Alica", 36130463232503300L, "5mG7tiv_Dto&list=PL351kuEPXTjHxpeBBCLFlwgTzf7KHYC6b"),
    BLAIR("Blair", 36131916268599556L, "5mG7tiv_Dto&list=PL351kuEPXTjHxpeBBCLFlwgTzf7KHYC6b"),
    EADIE("Eadie", 36130584427723268L, "5mG7tiv_Dto&list=PL351kuEPXTjHxpeBBCLFlwgTzf7KHYC6b"),
    MYLES("Myles", 36130464172301828L, "5mG7tiv_Dto&list=PL351kuEPXTjHxpeBBCLFlwgTzf7KHYC6b"),
    NO_MATCH("Unknown", 1L, "5mG7tiv_Dto&list=PL351kuEPXTjHxpeBBCLFlwgTzf7KHYC6b");

    private String name;
    private long bandId;
    private String playlistId;

    UserPlaylist(String name, long bandId, String playlistId) {
        this.name = name;
        this.bandId = bandId;
        this.playlistId = playlistId;
    }

    public static UserPlaylist findByBandId(long bandId) {
        return Arrays.stream(values())
                .filter(userPlaylist -> bandId == userPlaylist.bandId)
                .findFirst()
                .orElse(NO_MATCH);
    }

    public String getName() {
        return name;
    }

    public long getBandId() {
        return bandId;
    }

    public String getPlaylistId() {
        return playlistId;
    }
}