// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import intellij.haskell.psi.HaskellConstr3;
import intellij.haskell.psi.HaskellTtype;
import intellij.haskell.psi.HaskellUnpackNounpackPragma;
import intellij.haskell.psi.HaskellVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class HaskellConstr3Impl extends HaskellCompositeElementImpl implements HaskellConstr3 {

    public HaskellConstr3Impl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull HaskellVisitor visitor) {
        visitor.visitConstr3(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof HaskellVisitor) accept((HaskellVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<HaskellTtype> getTtypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTtype.class);
    }

    @Override
    @NotNull
    public List<HaskellUnpackNounpackPragma> getUnpackNounpackPragmaList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellUnpackNounpackPragma.class);
    }

}
