package com.dwolfnineteen.jpdapi.entities.responses;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Response {
    protected String error;

    @SerializedName("project_id")
    protected String projectID;

    @SerializedName("project_name")
    protected String projectName;

    @Nullable
    public String getError() {
        return error;
    }

    @NotNull
    public String getProjectID() {
        return projectID;
    }

    @NotNull
    public String getProjectName() {
        return projectName;
    }
}
