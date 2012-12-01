<% include '/WEB-INF/includes/header.gtpl' %>
<div class="hero-unit">
<h1>Current Date</h1>

<p>
    The current date and time: <%= request.getAttribute('datetime') %>
</p>
<p>
    The original URI is: <%= request.getAttribute('originalURI') %>
</p>
</div>
<% include '/WEB-INF/includes/footer.gtpl' %>

