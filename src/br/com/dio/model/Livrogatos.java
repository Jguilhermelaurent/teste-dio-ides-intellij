package br.com.dio.model;

import java.util.Objects;

public class Livrogatos {

    private String nome_livro;
    private String subtitulo;
    private String autor;
    private Integer numero_paginas;

    public Livrogatos() {
        this.nome_livro = nome_livro;
        this.subtitulo  = subtitulo;
        this.autor = autor;
        this.numero_paginas = numero_paginas;
    }

    public String getNome_livro() {
        return nome_livro;
    }

    public void setNome_livro(String nome_livro) {
        this.nome_livro = nome_livro;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(Integer numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livrogatos that = (Livrogatos) o;
        return Objects.equals(nome_livro, that.nome_livro) && Objects.equals(subtitulo, that.subtitulo) && Objects.equals(autor, that.autor) && Objects.equals(numero_paginas, that.numero_paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome_livro, subtitulo, autor, numero_paginas);
    }

    @Override
    public String toString() {
        return "Livrogatos{" +
                "nome_livro='" + nome_livro + '\'' +
                ", subtitulo='" + subtitulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numero_paginas=" + numero_paginas +
                '}';
    }
}
