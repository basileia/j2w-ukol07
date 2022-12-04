[#ftl]

[@c.page]
    <div class="card">
        <div>
            <h2>${post.title}</h2>
            <h3>${post.author}</h3>
            <h4>${post.published}</h4>
            <div>${post.perex?no_esc}</div>
            <div>${post.body?no_esc}</div>
        </div>
    </div>
    [@c.back/]
[/@c.page]