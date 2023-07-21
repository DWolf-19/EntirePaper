package org.dwolf19.jpdapi.entities.responses;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public abstract class Response {
    protected final @SerializedName("project_id") String projectID;
    protected final @SerializedName("project_name") String projectName;

    protected Response(@NotNull String projectID, @NotNull String projectName) {
        this.projectID = projectID;
        this.projectName = projectName;
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
