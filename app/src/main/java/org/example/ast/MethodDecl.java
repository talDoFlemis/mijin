package org.example.ast;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.visitor.Visitor;

@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
public class MethodDecl extends Node {
    private Type type;
    private String identifier;
    private FormalList formals;
    private VarDeclList varDecls;
    private StatementList statements;
    private Expression returnExpression;

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
}
