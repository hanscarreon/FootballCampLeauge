package com.example.footballcampleauge.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Leagues_model {

    @SerializedName("countrys")
    private List<Leagues_model.Leagues> leagues = null;

    public List<Leagues_model.Leagues> getLeagues() {
        return leagues;
    }

    public class Leagues {

        @SerializedName("idLeague")
        private String idLeague;
        @SerializedName("idSoccerXML")
        private Object idSoccerXML;
        @SerializedName("idAPIfootball")
        private String idAPIfootball;
        @SerializedName("strSport")
        private String strSport;
        @SerializedName("strLeague")
        private String strLeague;
        @SerializedName("strLeagueAlternate")
        private String strLeagueAlternate;
        @SerializedName("strDivision")
        private String strDivision;
        @SerializedName("idCup")
        private String idCup;
        @SerializedName("strCurrentSeason")
        private String strCurrentSeason;
        @SerializedName("intFormedYear")
        private String intFormedYear;
        @SerializedName("dateFirstEvent")
        private String dateFirstEvent;
        @SerializedName("strGender")
        private String strGender;
        @SerializedName("strCountry")
        private String strCountry;
        @SerializedName("strWebsite")
        private String strWebsite;
        @SerializedName("strFacebook")
        private String strFacebook;
        @SerializedName("strTwitter")
        private String strTwitter;
        @SerializedName("strYoutube")
        private String strYoutube;
        @SerializedName("strRSS")
        private String strRSS;
        @SerializedName("strDescriptionEN")
        private String strDescriptionEN;
        @SerializedName("strDescriptionDE")
        private Object strDescriptionDE;
        @SerializedName("strDescriptionFR")
        private Object strDescriptionFR;
        @SerializedName("strDescriptionIT")
        private Object strDescriptionIT;
        @SerializedName("strDescriptionCN")
        private Object strDescriptionCN;
        @SerializedName("strDescriptionJP")
        private Object strDescriptionJP;
        @SerializedName("strDescriptionRU")
        private Object strDescriptionRU;
        @SerializedName("strDescriptionES")
        private Object strDescriptionES;
        @SerializedName("strDescriptionPT")
        private Object strDescriptionPT;
        @SerializedName("strDescriptionSE")
        private Object strDescriptionSE;
        @SerializedName("strDescriptionNL")
        private Object strDescriptionNL;
        @SerializedName("strDescriptionHU")
        private Object strDescriptionHU;
        @SerializedName("strDescriptionNO")
        private Object strDescriptionNO;
        @SerializedName("strDescriptionPL")
        private Object strDescriptionPL;
        @SerializedName("strDescriptionIL")
        private Object strDescriptionIL;
        @SerializedName("strFanart1")
        private Object strFanart1;
        @SerializedName("strFanart2")
        private Object strFanart2;
        @SerializedName("strFanart3")
        private Object strFanart3;
        @SerializedName("strFanart4")
        private Object strFanart4;
        @SerializedName("strBanner")
        private Object strBanner;
        @SerializedName("strBadge")
        private String strBadge;
        @SerializedName("strLogo")
        private String strLogo;
        @SerializedName("strPoster")
        private Object strPoster;
        @SerializedName("strTrophy")
        private Object strTrophy;
        @SerializedName("strNaming")
        private String strNaming;
        @SerializedName("strComplete")
        private Object strComplete;
        @SerializedName("strLocked")
        private String strLocked;

        public String getIdLeague() {
            return idLeague;
        }

        public void setIdLeague(String idLeague) {
            this.idLeague = idLeague;
        }

        public Object getIdSoccerXML() {
            return idSoccerXML;
        }

        public void setIdSoccerXML(Object idSoccerXML) {
            this.idSoccerXML = idSoccerXML;
        }

        public String getIdAPIfootball() {
            return idAPIfootball;
        }

        public void setIdAPIfootball(String idAPIfootball) {
            this.idAPIfootball = idAPIfootball;
        }

        public String getStrSport() {
            return strSport;
        }

        public void setStrSport(String strSport) {
            this.strSport = strSport;
        }

        public String getStrLeague() {
            return strLeague;
        }

        public void setStrLeague(String strLeague) {
            this.strLeague = strLeague;
        }

        public String getStrLeagueAlternate() {
            return strLeagueAlternate;
        }

        public void setStrLeagueAlternate(String strLeagueAlternate) {
            this.strLeagueAlternate = strLeagueAlternate;
        }

        public String getStrDivision() {
            return strDivision;
        }

        public void setStrDivision(String strDivision) {
            this.strDivision = strDivision;
        }

        public String getIdCup() {
            return idCup;
        }

        public void setIdCup(String idCup) {
            this.idCup = idCup;
        }

        public String getStrCurrentSeason() {
            return strCurrentSeason;
        }

        public void setStrCurrentSeason(String strCurrentSeason) {
            this.strCurrentSeason = strCurrentSeason;
        }

        public String getIntFormedYear() {
            return intFormedYear;
        }

        public void setIntFormedYear(String intFormedYear) {
            this.intFormedYear = intFormedYear;
        }

        public String getDateFirstEvent() {
            return dateFirstEvent;
        }

        public void setDateFirstEvent(String dateFirstEvent) {
            this.dateFirstEvent = dateFirstEvent;
        }

        public String getStrGender() {
            return strGender;
        }

        public void setStrGender(String strGender) {
            this.strGender = strGender;
        }

        public String getStrCountry() {
            return strCountry;
        }

        public void setStrCountry(String strCountry) {
            this.strCountry = strCountry;
        }

        public String getStrWebsite() {
            return strWebsite;
        }

        public void setStrWebsite(String strWebsite) {
            this.strWebsite = strWebsite;
        }

        public String getStrFacebook() {
            return strFacebook;
        }

        public void setStrFacebook(String strFacebook) {
            this.strFacebook = strFacebook;
        }

        public String getStrTwitter() {
            return strTwitter;
        }

        public void setStrTwitter(String strTwitter) {
            this.strTwitter = strTwitter;
        }

        public String getStrYoutube() {
            return strYoutube;
        }

        public void setStrYoutube(String strYoutube) {
            this.strYoutube = strYoutube;
        }

        public String getStrRSS() {
            return strRSS;
        }

        public void setStrRSS(String strRSS) {
            this.strRSS = strRSS;
        }

        public String getStrDescriptionEN() {
            return strDescriptionEN;
        }

        public void setStrDescriptionEN(String strDescriptionEN) {
            this.strDescriptionEN = strDescriptionEN;
        }

        public Object getStrDescriptionDE() {
            return strDescriptionDE;
        }

        public void setStrDescriptionDE(Object strDescriptionDE) {
            this.strDescriptionDE = strDescriptionDE;
        }

        public Object getStrDescriptionFR() {
            return strDescriptionFR;
        }

        public void setStrDescriptionFR(Object strDescriptionFR) {
            this.strDescriptionFR = strDescriptionFR;
        }

        public Object getStrDescriptionIT() {
            return strDescriptionIT;
        }

        public void setStrDescriptionIT(Object strDescriptionIT) {
            this.strDescriptionIT = strDescriptionIT;
        }

        public Object getStrDescriptionCN() {
            return strDescriptionCN;
        }

        public void setStrDescriptionCN(Object strDescriptionCN) {
            this.strDescriptionCN = strDescriptionCN;
        }

        public Object getStrDescriptionJP() {
            return strDescriptionJP;
        }

        public void setStrDescriptionJP(Object strDescriptionJP) {
            this.strDescriptionJP = strDescriptionJP;
        }

        public Object getStrDescriptionRU() {
            return strDescriptionRU;
        }

        public void setStrDescriptionRU(Object strDescriptionRU) {
            this.strDescriptionRU = strDescriptionRU;
        }

        public Object getStrDescriptionES() {
            return strDescriptionES;
        }

        public void setStrDescriptionES(Object strDescriptionES) {
            this.strDescriptionES = strDescriptionES;
        }

        public Object getStrDescriptionPT() {
            return strDescriptionPT;
        }

        public void setStrDescriptionPT(Object strDescriptionPT) {
            this.strDescriptionPT = strDescriptionPT;
        }

        public Object getStrDescriptionSE() {
            return strDescriptionSE;
        }

        public void setStrDescriptionSE(Object strDescriptionSE) {
            this.strDescriptionSE = strDescriptionSE;
        }

        public Object getStrDescriptionNL() {
            return strDescriptionNL;
        }

        public void setStrDescriptionNL(Object strDescriptionNL) {
            this.strDescriptionNL = strDescriptionNL;
        }

        public Object getStrDescriptionHU() {
            return strDescriptionHU;
        }

        public void setStrDescriptionHU(Object strDescriptionHU) {
            this.strDescriptionHU = strDescriptionHU;
        }

        public Object getStrDescriptionNO() {
            return strDescriptionNO;
        }

        public void setStrDescriptionNO(Object strDescriptionNO) {
            this.strDescriptionNO = strDescriptionNO;
        }

        public Object getStrDescriptionPL() {
            return strDescriptionPL;
        }

        public void setStrDescriptionPL(Object strDescriptionPL) {
            this.strDescriptionPL = strDescriptionPL;
        }

        public Object getStrDescriptionIL() {
            return strDescriptionIL;
        }

        public void setStrDescriptionIL(Object strDescriptionIL) {
            this.strDescriptionIL = strDescriptionIL;
        }

        public Object getStrFanart1() {
            return strFanart1;
        }

        public void setStrFanart1(Object strFanart1) {
            this.strFanart1 = strFanart1;
        }

        public Object getStrFanart2() {
            return strFanart2;
        }

        public void setStrFanart2(Object strFanart2) {
            this.strFanart2 = strFanart2;
        }

        public Object getStrFanart3() {
            return strFanart3;
        }

        public void setStrFanart3(Object strFanart3) {
            this.strFanart3 = strFanart3;
        }

        public Object getStrFanart4() {
            return strFanart4;
        }

        public void setStrFanart4(Object strFanart4) {
            this.strFanart4 = strFanart4;
        }

        public Object getStrBanner() {
            return strBanner;
        }

        public void setStrBanner(Object strBanner) {
            this.strBanner = strBanner;
        }

        public String getStrBadge() {
            return strBadge;
        }

        public void setStrBadge(String strBadge) {
            this.strBadge = strBadge;
        }

        public String getStrLogo() {
            return strLogo;
        }

        public void setStrLogo(String strLogo) {
            this.strLogo = strLogo;
        }

        public Object getStrPoster() {
            return strPoster;
        }

        public void setStrPoster(Object strPoster) {
            this.strPoster = strPoster;
        }

        public Object getStrTrophy() {
            return strTrophy;
        }

        public void setStrTrophy(Object strTrophy) {
            this.strTrophy = strTrophy;
        }

        public String getStrNaming() {
            return strNaming;
        }

        public void setStrNaming(String strNaming) {
            this.strNaming = strNaming;
        }

        public Object getStrComplete() {
            return strComplete;
        }

        public void setStrComplete(Object strComplete) {
            this.strComplete = strComplete;
        }

        public String getStrLocked() {
            return strLocked;
        }

        public void setStrLocked(String strLocked) {
            this.strLocked = strLocked;
        }

    }
}
