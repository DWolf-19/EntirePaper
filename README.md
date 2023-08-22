# JPD-API
![JDP-API](banner.png)
--
A lightweight Java wrapper for the Paper downloads API.

# Plans
Downloading (for example, Paper) will occur along a chain of methods:
```java
JPD jpd = new JPDBuilder().build();

jpd.getProject("paper") // Project ID
    .getVersion("1.12.2")
    .getBuild("1620")
    .getApplication() // Or getMojangMappings()
    // download(<output path>) can be executed async without blocking the Thread
    // To do this, turn them on: JPD jpd = new JPDBuilder().enableAsyncDownloads().build();
    .download("/temp/paperdownloads/paper.jar"); 
```

> **Warning**
> We do not recommended using JPD-API in production until the first beta/stable release.

Also, not excluding, in future alpha versions, the library will be able to execute ALL requests asynchronously. However, for write various automation scripts, the usual synchronous behavior in combination with asynchronous downloading is enough for most tasks.
