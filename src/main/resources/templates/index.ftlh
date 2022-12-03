[#ftl]

[@c.page]
    [#list listOfPosts as post]
    [#if post.published?exists]
        [#if .now > post.published]
            <div class="card">
                <a href="/detail/${post.slug}">
                   <div>${post.title}</div>
                   </a>
                   <div>${post.perex?no_esc}</div>
            </div>
        [/#if]
    [/#if]
    [/#list]
[/@c.page]