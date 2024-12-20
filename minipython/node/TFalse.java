/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

@SuppressWarnings("nls")
public final class TFalse extends Token
{
    public TFalse()
    {
        super.setText("False");
    }

    public TFalse(int line, int pos)
    {
        super.setText("False");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFalse(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFalse(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFalse text.");
    }
}
