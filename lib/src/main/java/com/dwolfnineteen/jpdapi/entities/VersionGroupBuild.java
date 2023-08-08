/*
Copyright (c) 2023 DWolf Nineteen & The JPD-API contributors

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.dwolfnineteen.jpdapi.entities;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class VersionGroupBuild {
    private String version;
    private int build;
    private String time;
    private Channel channel;
    private boolean promoted;
    private List<Change> changes;
    private List<Download> downloads;

    @NotNull
    public String getVersion() {
        return version;
    }

    public int getBuild() {
        return build;
    }

    @NotNull
    public String getTime() {
        return time;
    }

    @NotNull
    public Channel getChannel() {
        return channel;
    }

    public boolean isPromoted() {
        return promoted;
    }

    @NotNull
    public List<Change> getChanges() {
        return changes;
    }

    @NotNull
    public List<Download> getDownloads() {
        return downloads;
    }
}
