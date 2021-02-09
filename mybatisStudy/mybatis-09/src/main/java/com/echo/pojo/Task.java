package com.echo.pojo;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
    private Integer id;
    private String serial;
    private String name;
    private String type;
    private String files;
    private String path;
    private String cmd;
    private String processId;
    private String result;
    private String resultDir;
    private Date submitTime;
    private Date startTime;
    private Date finishTime;
    private Date updateTime;
    private int state;
    private int isdelete;
    private String drugDb;

    public Task() {
    }

    public Task(Integer id, String serial, String name, String type, String files, String path, String cmd, String processId, String result, String resultDir, Date submitTime, Date startTime, Date finishTime, Date updateTime, int state, int isdelete, String drugDb) {
        this.id = id;
        this.serial = serial;
        this.name = name;
        this.type = type;
        this.files = files;
        this.path = path;
        this.cmd = cmd;
        this.processId = processId;
        this.result = result;
        this.resultDir = resultDir;
        this.submitTime = submitTime;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.updateTime = updateTime;
        this.state = state;
        this.isdelete = isdelete;
        this.drugDb = drugDb;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResultDir() {
        return resultDir;
    }

    public void setResultDir(String resultDir) {
        this.resultDir = resultDir;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    public String getDrugDb() {
        return drugDb;
    }

    public void setDrugDb(String drugDb) {
        this.drugDb = drugDb;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", files='" + files + '\'' +
                ", path='" + path + '\'' +
                ", cmd='" + cmd + '\'' +
                ", processId='" + processId + '\'' +
                ", result='" + result + '\'' +
                ", resultDir='" + resultDir + '\'' +
                ", submitTime=" + submitTime +
                ", startTime=" + startTime +
                ", finishTime=" + finishTime +
                ", updateTime=" + updateTime +
                ", state=" + state +
                ", isdelete=" + isdelete +
                ", drugDb='" + drugDb + '\'' +
                '}';
    }
}
