[#ftl]

[#macro page]
    <!DOCTYPE html>
    <html lang="cs">
    <head>
        <meta charset="UTF-8">
        <title>Můj blog</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
        <link rel="stylesheet" href="/css/style.css">
        <link rel="icon" type="image/png" href="/images/favicon.png">
    </head>
    <body>
        <div class="header">
            <header>
                <h1>Můj blog</h1>
            </header>
        </div>
    [#nested]
    </body>
    </html>
[/#macro]

[#macro back]
    <div class="back">
    <nav>
        <a href="/">◂ zpět na seznam</a>
    </nav>
    </div>
[/#macro]