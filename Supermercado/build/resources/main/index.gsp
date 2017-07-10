<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Disciplina - Desenvolvimento de software para web</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <!--<content tag="nav">
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Application Status <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Environment: ${grails.util.Environment.current.name}</a></li>
                <li><a href="#">App profile: ${grailsApplication.config.grails?.profile}</a></li>
                <li><a href="#">App version:
                    <g:meta name="info.app.version"/></a>
                </li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Grails version:
                    <g:meta name="info.app.grailsVersion"/></a>
                </li>
                <li><a href="#">Groovy version: ${GroovySystem.getVersion()}</a></li>
                <li><a href="#">JVM version: ${System.getProperty('java.version')}</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Artefacts <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Controllers: ${grailsApplication.controllerClasses.size()}</a></li>
                <li><a href="#">Domains: ${grailsApplication.domainClasses.size()}</a></li>
                <li><a href="#">Services: ${grailsApplication.serviceClasses.size()}</a></li>
                <li><a href="#">Tag Libraries: ${grailsApplication.tagLibClasses.size()}</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Installed Plugins <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
                    <li><a href="#">${plugin.name} - ${plugin.version}</a></li>
                </g:each>
            </ul>
        </li>
    </content>  -->


    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Home</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="/logout">Logout</a>
                    </li>

                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
    <!--
    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>
        </div>
    </div>
-->
    
    
    <!-- Page Content -->
    <div class="container">
        <hr>

        
        <!-- Page Features -->
        <div class="row text-center">

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <asset:image src="comprar.jpg" class="logo"/>
                    
                    <div class="caption">
                        <h3>Compra</h3>
                        <p>Clique aqui para iniciar uma nova compra.</p>
                        <p>
                            <g:link class="btn btn-primary" controller="compra">Compra</g:link>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <asset:image src="produtos.jpg" class="logo"/>
                    <div class="caption">
                        <h3>Produtos</h3>
                        <p>Clique aqui para gerenciar os produtos do supermercado.</p>
                        <p>
                            <g:link class="btn btn-primary" controller="produto">Produtos</g:link>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <asset:image src="endereco.jpg" class="logo"/>
                    <div class="caption">
                        <h3>Endereços</h3>
                        <p>Clique aqui para gerenciar os endereços do sistema.</p>
                        <p>
                            <g:link class="btn btn-primary" controller="endereco">Endereços</g:link>
                        </p>
                    </div>
                </div>
            </div>

        </div>
        <!-- /.row -->
        <div class="row text-center">

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <asset:image src="funcionario.jpg" class="logo"/>
                    <div class="caption">
                        <h3>Funcionários</h3>
                        <p>Clique aqui para gerenciar os funcionários da empresa.</p>
                        <p>
                            <g:link class="btn btn-primary" controller="funcionario">Funcionários</g:link>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <asset:image src="fornecedor.jpg" class="logo"/>
                    <div class="caption">
                        <h3>Fornecedores</h3>
                        <p>Clique aqui para gerenciar os fornecedores do supermercado.</p>
                        <p>
                            <g:link class="btn btn-primary" controller="fornecedor">Fornecedores</g:link>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <asset:image src="cliente.jpg" class="logo"/>
                    <div class="caption">
                        <h3>Clientes</h3>
                        <p>Clique aqui para gerenciar os clientes do supermercado.</p>
                        <p>
                            <g:link class="btn btn-primary" controller="cliente">Clientes</g:link>
                        </p>
                    </div>
                </div>
            </div>

        </div>

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Desenvolvimento Web 2017 - Delano Beder</p>
                </div>
            </div>
        </footer>

    </div>

</body>
</html>
