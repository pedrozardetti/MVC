package br.com.carstore.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// Filtro é aplicado em todas as requisições que o caminho começa com /admin/
@WebFilter("/admin/*")
public class AuthenticationFilter implements Filter {

    // Inicializa o filtro. É chamado uma vez quando o filtro é criado e permite a config inicial
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    // Executa a lógica principal do filtro. É chamado para cada requisição que passa pelo filtro.
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    // Limpa os recursos. É chamada uma vez quando o filtro está sendo removido.
    @Override
    public void destroy() {

    }
}
