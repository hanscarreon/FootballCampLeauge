package com.example.footballcampleauge.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GamesModel {
    @SerializedName("events")
    private List<Games> games = null;

    public List<GamesModel.Games> getEvents() {
        return games;
    }
    public class Games {

        @SerializedName("idEvent")
        private String idEvent;
        @SerializedName("idSoccerXML")
        private Object idSoccerXML;
        @SerializedName("idAPIfootball")
        private Object idAPIfootball;
        @SerializedName("strEvent")
        private String strEvent;
        @SerializedName("strEventAlternate")
        private String strEventAlternate;
        @SerializedName("strFilename")
        private String strFilename;
        @SerializedName("strSport")
        private String strSport;
        @SerializedName("idLeague")
        private String idLeague;
        @SerializedName("strLeague")
        private String strLeague;
        @SerializedName("strSeason")
        private String strSeason;
        @SerializedName("strDescriptionEN")
        private String strDescriptionEN;
        @SerializedName("strHomeTeam")
        private String strHomeTeam;
        @SerializedName("strAwayTeam")
        private String strAwayTeam;
        @SerializedName("intHomeScore")
        private String intHomeScore;
        @SerializedName("intRound")
        private String intRound;
        @SerializedName("intAwayScore")
        private String intAwayScore;
        @SerializedName("intSpectators")
        private Object intSpectators;
        @SerializedName("strOfficial")
        private Object strOfficial;
        @SerializedName("strHomeGoalDetails")
        private Object strHomeGoalDetails;
        @SerializedName("strHomeRedCards")
        private Object strHomeRedCards;
        @SerializedName("strHomeYellowCards")
        private Object strHomeYellowCards;
        @SerializedName("strHomeLineupGoalkeeper")
        private Object strHomeLineupGoalkeeper;
        @SerializedName("strHomeLineupDefense")
        private Object strHomeLineupDefense;
        @SerializedName("strHomeLineupMidfield")
        private Object strHomeLineupMidfield;
        @SerializedName("strHomeLineupForward")
        private Object strHomeLineupForward;
        @SerializedName("strHomeLineupSubstitutes")
        private Object strHomeLineupSubstitutes;
        @SerializedName("strHomeFormation")
        private Object strHomeFormation;
        @SerializedName("strAwayRedCards")
        private Object strAwayRedCards;
        @SerializedName("strAwayYellowCards")
        private Object strAwayYellowCards;
        @SerializedName("strAwayGoalDetails")
        private Object strAwayGoalDetails;
        @SerializedName("strAwayLineupGoalkeeper")
        private Object strAwayLineupGoalkeeper;
        @SerializedName("strAwayLineupDefense")
        private Object strAwayLineupDefense;
        @SerializedName("strAwayLineupMidfield")
        private Object strAwayLineupMidfield;
        @SerializedName("strAwayLineupForward")
        private Object strAwayLineupForward;
        @SerializedName("strAwayLineupSubstitutes")
        private Object strAwayLineupSubstitutes;
        @SerializedName("strAwayFormation")
        private Object strAwayFormation;
        @SerializedName("intHomeShots")
        private Object intHomeShots;
        @SerializedName("intAwayShots")
        private Object intAwayShots;
        @SerializedName("strTimestamp")
        private String strTimestamp;
        @SerializedName("dateEvent")
        private String dateEvent;
        @SerializedName("dateEventLocal")
        private String dateEventLocal;
        @SerializedName("strDate")
        private Object strDate;
        @SerializedName("strTime")
        private String strTime;
        @SerializedName("strTimeLocal")
        private String strTimeLocal;
        @SerializedName("strTVStation")
        private Object strTVStation;
        @SerializedName("idHomeTeam")
        private String idHomeTeam;
        @SerializedName("idAwayTeam")
        private String idAwayTeam;
        @SerializedName("strResult")
        private String strResult;
        @SerializedName("strVenue")
        private String strVenue;
        @SerializedName("strCountry")
        private Object strCountry;
        @SerializedName("strCity")
        private Object strCity;
        @SerializedName("strPoster")
        private Object strPoster;
        @SerializedName("strFanart")
        private Object strFanart;
        @SerializedName("strThumb")
        private Object strThumb;
        @SerializedName("strBanner")
        private Object strBanner;
        @SerializedName("strMap")
        private Object strMap;
        @SerializedName("strTweet1")
        private String strTweet1;
        @SerializedName("strTweet2")
        private String strTweet2;
        @SerializedName("strTweet3")
        private String strTweet3;
        @SerializedName("strVideo")
        private String strVideo;
        @SerializedName("strStatus")
        private Object strStatus;
        @SerializedName("strPostponed")
        private String strPostponed;
        @SerializedName("strLocked")
        private String strLocked;

        public String getIdEvent() {
            return idEvent;
        }

        public void setIdEvent(String idEvent) {
            this.idEvent = idEvent;
        }

        public Object getIdSoccerXML() {
            return idSoccerXML;
        }

        public void setIdSoccerXML(Object idSoccerXML) {
            this.idSoccerXML = idSoccerXML;
        }

        public Object getIdAPIfootball() {
            return idAPIfootball;
        }

        public void setIdAPIfootball(Object idAPIfootball) {
            this.idAPIfootball = idAPIfootball;
        }

        public String getStrEvent() {
            return strEvent;
        }

        public void setStrEvent(String strEvent) {
            this.strEvent = strEvent;
        }

        public String getStrEventAlternate() {
            return strEventAlternate;
        }

        public void setStrEventAlternate(String strEventAlternate) {
            this.strEventAlternate = strEventAlternate;
        }

        public String getStrFilename() {
            return strFilename;
        }

        public void setStrFilename(String strFilename) {
            this.strFilename = strFilename;
        }

        public String getStrSport() {
            return strSport;
        }

        public void setStrSport(String strSport) {
            this.strSport = strSport;
        }

        public String getIdLeague() {
            return idLeague;
        }

        public void setIdLeague(String idLeague) {
            this.idLeague = idLeague;
        }

        public String getStrLeague() {
            return strLeague;
        }

        public void setStrLeague(String strLeague) {
            this.strLeague = strLeague;
        }

        public String getStrSeason() {
            return strSeason;
        }

        public void setStrSeason(String strSeason) {
            this.strSeason = strSeason;
        }

        public String getStrDescriptionEN() {
            return strDescriptionEN;
        }

        public void setStrDescriptionEN(String strDescriptionEN) {
            this.strDescriptionEN = strDescriptionEN;
        }

        public String getStrHomeTeam() {
            return strHomeTeam;
        }

        public void setStrHomeTeam(String strHomeTeam) {
            this.strHomeTeam = strHomeTeam;
        }

        public String getStrAwayTeam() {
            return strAwayTeam;
        }

        public void setStrAwayTeam(String strAwayTeam) {
            this.strAwayTeam = strAwayTeam;
        }

        public String getIntHomeScore() {
            return intHomeScore;
        }

        public void setIntHomeScore(String intHomeScore) {
            this.intHomeScore = intHomeScore;
        }

        public String getIntRound() {
            return intRound;
        }

        public void setIntRound(String intRound) {
            this.intRound = intRound;
        }

        public String getIntAwayScore() {
            return intAwayScore;
        }

        public void setIntAwayScore(String intAwayScore) {
            this.intAwayScore = intAwayScore;
        }

        public Object getIntSpectators() {
            return intSpectators;
        }

        public void setIntSpectators(Object intSpectators) {
            this.intSpectators = intSpectators;
        }

        public Object getStrOfficial() {
            return strOfficial;
        }

        public void setStrOfficial(Object strOfficial) {
            this.strOfficial = strOfficial;
        }

        public Object getStrHomeGoalDetails() {
            return strHomeGoalDetails;
        }

        public void setStrHomeGoalDetails(Object strHomeGoalDetails) {
            this.strHomeGoalDetails = strHomeGoalDetails;
        }

        public Object getStrHomeRedCards() {
            return strHomeRedCards;
        }

        public void setStrHomeRedCards(Object strHomeRedCards) {
            this.strHomeRedCards = strHomeRedCards;
        }

        public Object getStrHomeYellowCards() {
            return strHomeYellowCards;
        }

        public void setStrHomeYellowCards(Object strHomeYellowCards) {
            this.strHomeYellowCards = strHomeYellowCards;
        }

        public Object getStrHomeLineupGoalkeeper() {
            return strHomeLineupGoalkeeper;
        }

        public void setStrHomeLineupGoalkeeper(Object strHomeLineupGoalkeeper) {
            this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
        }

        public Object getStrHomeLineupDefense() {
            return strHomeLineupDefense;
        }

        public void setStrHomeLineupDefense(Object strHomeLineupDefense) {
            this.strHomeLineupDefense = strHomeLineupDefense;
        }

        public Object getStrHomeLineupMidfield() {
            return strHomeLineupMidfield;
        }

        public void setStrHomeLineupMidfield(Object strHomeLineupMidfield) {
            this.strHomeLineupMidfield = strHomeLineupMidfield;
        }

        public Object getStrHomeLineupForward() {
            return strHomeLineupForward;
        }

        public void setStrHomeLineupForward(Object strHomeLineupForward) {
            this.strHomeLineupForward = strHomeLineupForward;
        }

        public Object getStrHomeLineupSubstitutes() {
            return strHomeLineupSubstitutes;
        }

        public void setStrHomeLineupSubstitutes(Object strHomeLineupSubstitutes) {
            this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
        }

        public Object getStrHomeFormation() {
            return strHomeFormation;
        }

        public void setStrHomeFormation(Object strHomeFormation) {
            this.strHomeFormation = strHomeFormation;
        }

        public Object getStrAwayRedCards() {
            return strAwayRedCards;
        }

        public void setStrAwayRedCards(Object strAwayRedCards) {
            this.strAwayRedCards = strAwayRedCards;
        }

        public Object getStrAwayYellowCards() {
            return strAwayYellowCards;
        }

        public void setStrAwayYellowCards(Object strAwayYellowCards) {
            this.strAwayYellowCards = strAwayYellowCards;
        }

        public Object getStrAwayGoalDetails() {
            return strAwayGoalDetails;
        }

        public void setStrAwayGoalDetails(Object strAwayGoalDetails) {
            this.strAwayGoalDetails = strAwayGoalDetails;
        }

        public Object getStrAwayLineupGoalkeeper() {
            return strAwayLineupGoalkeeper;
        }

        public void setStrAwayLineupGoalkeeper(Object strAwayLineupGoalkeeper) {
            this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
        }

        public Object getStrAwayLineupDefense() {
            return strAwayLineupDefense;
        }

        public void setStrAwayLineupDefense(Object strAwayLineupDefense) {
            this.strAwayLineupDefense = strAwayLineupDefense;
        }

        public Object getStrAwayLineupMidfield() {
            return strAwayLineupMidfield;
        }

        public void setStrAwayLineupMidfield(Object strAwayLineupMidfield) {
            this.strAwayLineupMidfield = strAwayLineupMidfield;
        }

        public Object getStrAwayLineupForward() {
            return strAwayLineupForward;
        }

        public void setStrAwayLineupForward(Object strAwayLineupForward) {
            this.strAwayLineupForward = strAwayLineupForward;
        }

        public Object getStrAwayLineupSubstitutes() {
            return strAwayLineupSubstitutes;
        }

        public void setStrAwayLineupSubstitutes(Object strAwayLineupSubstitutes) {
            this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
        }

        public Object getStrAwayFormation() {
            return strAwayFormation;
        }

        public void setStrAwayFormation(Object strAwayFormation) {
            this.strAwayFormation = strAwayFormation;
        }

        public Object getIntHomeShots() {
            return intHomeShots;
        }

        public void setIntHomeShots(Object intHomeShots) {
            this.intHomeShots = intHomeShots;
        }

        public Object getIntAwayShots() {
            return intAwayShots;
        }

        public void setIntAwayShots(Object intAwayShots) {
            this.intAwayShots = intAwayShots;
        }

        public String getStrTimestamp() {
            return strTimestamp;
        }

        public void setStrTimestamp(String strTimestamp) {
            this.strTimestamp = strTimestamp;
        }

        public String getDateEvent() {
            return dateEvent;
        }

        public void setDateEvent(String dateEvent) {
            this.dateEvent = dateEvent;
        }

        public String getDateEventLocal() {
            return dateEventLocal;
        }

        public void setDateEventLocal(String dateEventLocal) {
            this.dateEventLocal = dateEventLocal;
        }

        public Object getStrDate() {
            return strDate;
        }

        public void setStrDate(Object strDate) {
            this.strDate = strDate;
        }

        public String getStrTime() {
            return strTime;
        }

        public void setStrTime(String strTime) {
            this.strTime = strTime;
        }

        public String getStrTimeLocal() {
            return strTimeLocal;
        }

        public void setStrTimeLocal(String strTimeLocal) {
            this.strTimeLocal = strTimeLocal;
        }

        public Object getStrTVStation() {
            return strTVStation;
        }

        public void setStrTVStation(Object strTVStation) {
            this.strTVStation = strTVStation;
        }

        public String getIdHomeTeam() {
            return idHomeTeam;
        }

        public void setIdHomeTeam(String idHomeTeam) {
            this.idHomeTeam = idHomeTeam;
        }

        public String getIdAwayTeam() {
            return idAwayTeam;
        }

        public void setIdAwayTeam(String idAwayTeam) {
            this.idAwayTeam = idAwayTeam;
        }

        public String getStrResult() {
            return strResult;
        }

        public void setStrResult(String strResult) {
            this.strResult = strResult;
        }

        public String getStrVenue() {
            return strVenue;
        }

        public void setStrVenue(String strVenue) {
            this.strVenue = strVenue;
        }

        public Object getStrCountry() {
            return strCountry;
        }

        public void setStrCountry(Object strCountry) {
            this.strCountry = strCountry;
        }

        public Object getStrCity() {
            return strCity;
        }

        public void setStrCity(Object strCity) {
            this.strCity = strCity;
        }

        public Object getStrPoster() {
            return strPoster;
        }

        public void setStrPoster(Object strPoster) {
            this.strPoster = strPoster;
        }

        public Object getStrFanart() {
            return strFanart;
        }

        public void setStrFanart(Object strFanart) {
            this.strFanart = strFanart;
        }

        public Object getStrThumb() {
            return strThumb;
        }

        public void setStrThumb(Object strThumb) {
            this.strThumb = strThumb;
        }

        public Object getStrBanner() {
            return strBanner;
        }

        public void setStrBanner(Object strBanner) {
            this.strBanner = strBanner;
        }

        public Object getStrMap() {
            return strMap;
        }

        public void setStrMap(Object strMap) {
            this.strMap = strMap;
        }

        public String getStrTweet1() {
            return strTweet1;
        }

        public void setStrTweet1(String strTweet1) {
            this.strTweet1 = strTweet1;
        }

        public String getStrTweet2() {
            return strTweet2;
        }

        public void setStrTweet2(String strTweet2) {
            this.strTweet2 = strTweet2;
        }

        public String getStrTweet3() {
            return strTweet3;
        }

        public void setStrTweet3(String strTweet3) {
            this.strTweet3 = strTweet3;
        }

        public String getStrVideo() {
            return strVideo;
        }

        public void setStrVideo(String strVideo) {
            this.strVideo = strVideo;
        }

        public Object getStrStatus() {
            return strStatus;
        }

        public void setStrStatus(Object strStatus) {
            this.strStatus = strStatus;
        }

        public String getStrPostponed() {
            return strPostponed;
        }

        public void setStrPostponed(String strPostponed) {
            this.strPostponed = strPostponed;
        }

        public String getStrLocked() {
            return strLocked;
        }

        public void setStrLocked(String strLocked) {
            this.strLocked = strLocked;
        }

    }
}
