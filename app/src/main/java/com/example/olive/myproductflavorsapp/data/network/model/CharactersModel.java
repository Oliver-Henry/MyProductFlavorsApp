package com.example.olive.myproductflavorsapp.data.network.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharactersModel {

    @SerializedName("AbstractURL")
    @Expose
    private String abstractURL;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("Answer")
    @Expose
    private String answer;
    @SerializedName("Infobox")
    @Expose
    private String infobox;
    @SerializedName("Entity")
    @Expose
    private String entity;
    @SerializedName("DefinitionSource")
    @Expose
    private String definitionSource;
    @SerializedName("AnswerType")
    @Expose
    private String answerType;
    @SerializedName("Redirect")
    @Expose
    private String redirect;
    @SerializedName("ImageHeight")
    @Expose
    private Integer imageHeight;
    @SerializedName("Definition")
    @Expose
    private String definition;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("RelatedTopics")
    @Expose
    private List<RelatedTopic> relatedTopics = null;
    @SerializedName("AbstractText")
    @Expose
    private String abstractText;
    @SerializedName("ImageIsLogo")
    @Expose
    private Integer imageIsLogo;
    @SerializedName("Results")
    @Expose
    private List<Object> results = null;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Heading")
    @Expose
    private String heading;
    @SerializedName("ImageWidth")
    @Expose
    private Integer imageWidth;
    @SerializedName("AbstractSource")
    @Expose
    private String abstractSource;
    @SerializedName("DefinitionURL")
    @Expose
    private String definitionURL;
    @SerializedName("Abstract")
    @Expose
    private String _abstract;

    public String getAbstractURL() {
        return abstractURL;
    }

    public void setAbstractURL(String abstractURL) {
        this.abstractURL = abstractURL;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getInfobox() {
        return infobox;
    }

    public void setInfobox(String infobox) {
        this.infobox = infobox;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getDefinitionSource() {
        return definitionSource;
    }

    public void setDefinitionSource(String definitionSource) {
        this.definitionSource = definitionSource;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public Integer getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<RelatedTopic> getRelatedTopics() {
        return relatedTopics;
    }

    public void setRelatedTopics(List<RelatedTopic> relatedTopics) {
        this.relatedTopics = relatedTopics;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public Integer getImageIsLogo() {
        return imageIsLogo;
    }

    public void setImageIsLogo(Integer imageIsLogo) {
        this.imageIsLogo = imageIsLogo;
    }

    public List<Object> getResults() {
        return results;
    }

    public void setResults(List<Object> results) {
        this.results = results;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public Integer getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getAbstractSource() {
        return abstractSource;
    }

    public void setAbstractSource(String abstractSource) {
        this.abstractSource = abstractSource;
    }

    public String getDefinitionURL() {
        return definitionURL;
    }

    public void setDefinitionURL(String definitionURL) {
        this.definitionURL = definitionURL;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

}
