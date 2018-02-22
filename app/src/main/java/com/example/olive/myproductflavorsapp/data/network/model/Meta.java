package com.example.olive.myproductflavorsapp.data.network.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("attribution")
    @Expose
    private Object attribution;
    @SerializedName("src_domain")
    @Expose
    private String srcDomain;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("production_state")
    @Expose
    private String productionState;
    @SerializedName("is_stackexchange")
    @Expose
    private Object isStackexchange;
    @SerializedName("js_callback_name")
    @Expose
    private String jsCallbackName;
    @SerializedName("unsafe")
    @Expose
    private Integer unsafe;
    @SerializedName("blockgroup")
    @Expose
    private Object blockgroup;
    @SerializedName("topic")
    @Expose
    private List<String> topic = null;
    @SerializedName("repo")
    @Expose
    private String repo;
    @SerializedName("maintainer")
    @Expose
    private Maintainer maintainer;
    @SerializedName("src_options")
    @Expose
    private SrcOptions srcOptions;
    @SerializedName("perl_module")
    @Expose
    private String perlModule;
    @SerializedName("created_date")
    @Expose
    private Object createdDate;
    @SerializedName("live_date")
    @Expose
    private Object liveDate;
    @SerializedName("src_name")
    @Expose
    private String srcName;
    @SerializedName("example_query")
    @Expose
    private String exampleQuery;
    @SerializedName("producer")
    @Expose
    private Object producer;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("developer")
    @Expose
    private List<Developer> developer = null;
    @SerializedName("src_url")
    @Expose
    private Object srcUrl;
    @SerializedName("src_id")
    @Expose
    private Integer srcId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("dev_date")
    @Expose
    private Object devDate;
    @SerializedName("signal_from")
    @Expose
    private String signalFrom;
    @SerializedName("designer")
    @Expose
    private Object designer;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tab")
    @Expose
    private String tab;
    @SerializedName("dev_milestone")
    @Expose
    private String devMilestone;

    public Object getAttribution() {
        return attribution;
    }

    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    public String getSrcDomain() {
        return srcDomain;
    }

    public void setSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductionState() {
        return productionState;
    }

    public void setProductionState(String productionState) {
        this.productionState = productionState;
    }

    public Object getIsStackexchange() {
        return isStackexchange;
    }

    public void setIsStackexchange(Object isStackexchange) {
        this.isStackexchange = isStackexchange;
    }

    public String getJsCallbackName() {
        return jsCallbackName;
    }

    public void setJsCallbackName(String jsCallbackName) {
        this.jsCallbackName = jsCallbackName;
    }

    public Integer getUnsafe() {
        return unsafe;
    }

    public void setUnsafe(Integer unsafe) {
        this.unsafe = unsafe;
    }

    public Object getBlockgroup() {
        return blockgroup;
    }

    public void setBlockgroup(Object blockgroup) {
        this.blockgroup = blockgroup;
    }

    public List<String> getTopic() {
        return topic;
    }

    public void setTopic(List<String> topic) {
        this.topic = topic;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public Maintainer getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(Maintainer maintainer) {
        this.maintainer = maintainer;
    }

    public SrcOptions getSrcOptions() {
        return srcOptions;
    }

    public void setSrcOptions(SrcOptions srcOptions) {
        this.srcOptions = srcOptions;
    }

    public String getPerlModule() {
        return perlModule;
    }

    public void setPerlModule(String perlModule) {
        this.perlModule = perlModule;
    }

    public Object getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Object createdDate) {
        this.createdDate = createdDate;
    }

    public Object getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(Object liveDate) {
        this.liveDate = liveDate;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    public String getExampleQuery() {
        return exampleQuery;
    }

    public void setExampleQuery(String exampleQuery) {
        this.exampleQuery = exampleQuery;
    }

    public Object getProducer() {
        return producer;
    }

    public void setProducer(Object producer) {
        this.producer = producer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Developer> getDeveloper() {
        return developer;
    }

    public void setDeveloper(List<Developer> developer) {
        this.developer = developer;
    }

    public Object getSrcUrl() {
        return srcUrl;
    }

    public void setSrcUrl(Object srcUrl) {
        this.srcUrl = srcUrl;
    }

    public Integer getSrcId() {
        return srcId;
    }

    public void setSrcId(Integer srcId) {
        this.srcId = srcId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getDevDate() {
        return devDate;
    }

    public void setDevDate(Object devDate) {
        this.devDate = devDate;
    }

    public String getSignalFrom() {
        return signalFrom;
    }

    public void setSignalFrom(String signalFrom) {
        this.signalFrom = signalFrom;
    }

    public Object getDesigner() {
        return designer;
    }

    public void setDesigner(Object designer) {
        this.designer = designer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public String getDevMilestone() {
        return devMilestone;
    }

    public void setDevMilestone(String devMilestone) {
        this.devMilestone = devMilestone;
    }

}