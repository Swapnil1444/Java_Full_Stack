# ServletProject Hello World

This is a simple Java servlet project with a single `HelloServlet`.

## Files

- `src/HelloServlet.java` - the servlet implementation
- `WebContent/index.html` - landing page with a button to call the servlet
- `WebContent/WEB-INF/web.xml` - servlet mapping and welcome file configuration

## Run

1. Build and deploy this project to a servlet container such as Apache Tomcat.
2. Access the application root in your browser, for example:
   - `http://localhost:8080/ServletProject/`
3. Click the "Run HelloServlet" button to see the servlet response.

## Notes

- The servlet is mapped to `/hello`.
- If your server uses the older Java EE namespace, update the imports in `HelloServlet.java` from `jakarta.servlet.*` to `javax.servlet.*` and adjust the `web.xml` schema accordingly.
